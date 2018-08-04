package cn.jzyunqi.ms.banner;

import cn.jzyunqi.common.model.RestResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @PostMapping("/banners/create")
    public RestResultDto create(BannerDto bannerDto) {
        return RestResultDto.success(bannerService.create(bannerDto));
    }

    @PostMapping("/banners/update")
    public RestResultDto update(BannerDto bannerDto) {
        return RestResultDto.success(bannerService.update(bannerDto));
    }

    @PostMapping("/banners/query")
    public RestResultDto query(Pageable pageable) {
        return RestResultDto.success(bannerService.query(pageable));
    }

    @PostMapping("/banners/delete")
    public RestResultDto deleteById(Long id) {
        bannerService.deleteById(id);
        return RestResultDto.success();
    }
}
