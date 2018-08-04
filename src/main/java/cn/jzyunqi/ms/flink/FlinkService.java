package cn.jzyunqi.ms.flink;

import cn.jzyunqi.common.model.PageDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.jdo.annotations.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlinkService {
    private IFlinkDao flinkDao;


    private FlinkDto entityToDto(Flink flink) {
        FlinkDto FlinkDto = new FlinkDto();
        FlinkDto.setType(flink.getType());
        FlinkDto.setUrl(flink.getUrl());
        return FlinkDto;
    }

    public PageDto<FlinkDto> query(Pageable pageable) {
        Page<Flink> Flinks = flinkDao.findAll(pageable);
        List<FlinkDto> FlinkDtos = Flinks.stream().map(this::entityToDto).collect(Collectors.toList());
        return new PageDto<FlinkDto>(FlinkDtos, Flinks.getTotalElements());
    }

    @Transactional
    public Flink create(FlinkDto flinkDto) {
        Flink Flink = new Flink();
        Flink.setType(flinkDto.getType());
        Flink.setUrl(flinkDto.getUrl());
        return flinkDao.save(Flink);
    }

    @Transactional
    public Flink update(FlinkDto flinkDto) {
        Flink Flink = flinkDao.findById(flinkDto.getId()).orElse(new Flink());
        Flink.setType(flinkDto.getType());
        Flink.setUrl(flinkDto.getUrl());
        return flinkDao.save(Flink);
    }

    @Transactional
    public void deleteById(Long id) {
        flinkDao.deleteById(id);
    }
}
