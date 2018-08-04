package cn.jzyunqi.ms.flink;

import cn.jzyunqi.common.model.RestResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
public class FlinkController {

    @Autowired
    private FlinkService flinkService;

    @PostMapping("/flinks/create")
    public RestResultDto create(FlinkDto flinkDto) {
        return RestResultDto.success(flinkService.create(flinkDto));
    }

    @PostMapping("/flinks/update")
    public RestResultDto update(FlinkDto flinkDto) {
        return RestResultDto.success(flinkService.update(flinkDto));
    }

    @PostMapping("/flinks/query")
    public RestResultDto query(Pageable pageable) {
        return RestResultDto.success(flinkService.query(pageable));
    }

    @PostMapping("/flinks/delete")
    public RestResultDto deleteById(Long id) {
        flinkService.deleteById(id);
        return RestResultDto.success();
    }
}
