package cn.jzyunqi.ms.banner;

import cn.jzyunqi.common.model.PageDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.jdo.annotations.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BannerService {
    private IBannerDao bannerDao;


    private BannerDto entityToDto(Banner banner) {
        BannerDto bannerDto = new BannerDto();
        bannerDto.setTitle(banner.getTitle());
        bannerDto.setFilepath(banner.getFilepath());
        bannerDto.setPriority(banner.getPriority());
        return bannerDto;
    }

    public PageDto<BannerDto> query(Pageable pageable) {
        Page<Banner> banners = bannerDao.findAll(pageable);
        List<BannerDto> bannerDtos = banners.stream().map(this::entityToDto).collect(Collectors.toList());
        return new PageDto<BannerDto>(bannerDtos, banners.getTotalElements());
    }

    @Transactional
    public Banner create(BannerDto bannerDto) {
        Banner banner = new Banner();
        banner.setTitle(bannerDto.getTitle());
        banner.setFilepath(bannerDto.getFilepath());
        banner.setPriority(bannerDto.getPriority());
        return bannerDao.save(banner);
    }

    @Transactional
    public Banner update(BannerDto bannerDto) {
        Banner banner = bannerDao.findById(bannerDto.getId()).orElse(new Banner());
        banner.setTitle(bannerDto.getTitle());
        banner.setFilepath(bannerDto.getFilepath());
        banner.setPriority(bannerDto.getPriority());
        return bannerDao.save(banner);
    }

    @Transactional
    public void deleteById(Long id) {
        bannerDao.deleteById(id);
    }
}
