package com.xuke.FailureAnalyzer;

import org.springframework.boot.diagnostics.AbstractFailureAnalyzer;
import org.springframework.boot.diagnostics.FailureAnalysis;

/**
 * @Author: XuKe
 * @CreateOn:2020-02-10 20:22
 * @Email ：wxk1035@gmail.com
 */
public class NullPointerFailureAnalyzer extends AbstractFailureAnalyzer<NullPointerException> {
    @Override
    protected FailureAnalysis analyze(Throwable rootFailure, NullPointerException cause) {
        return new FailureAnalysis(cause.getMessage(),"空指针异常！",cause);
    }
}
