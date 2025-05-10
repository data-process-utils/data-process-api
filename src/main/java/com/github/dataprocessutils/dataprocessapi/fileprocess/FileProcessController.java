package com.github.dataprocessutils.dataprocessapi.fileprocess;

import com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine.FilterInfo;
import com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine.SearchEngineFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/file-process")
public class FileProcessController {

    private final FileProcessService fileProcessService;

    @Autowired
    public FileProcessController(FileProcessService fileProcessService) {
        this.fileProcessService = fileProcessService;
    }


    @PostMapping
    public ResponseEntity<Object> processFile(@RequestBody FilterInfo filterDTO) {
        Object result = SearchEngineFactory.createSearchEngine(filterDTO.getType()).search(filterDTO);
        return ResponseEntity.ok(result);
    }

}
