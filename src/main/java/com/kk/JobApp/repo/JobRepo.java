package com.kk.JobApp.repo;

import com.kk.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    private List<JobPost> jobPostList = new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Dev","Java Dev Description",1,new ArrayList<>(Arrays.asList("Java","html"))),
            new JobPost(2,"Python","Python Dev Description",2,new ArrayList<>(Arrays.asList("Python","html"))),
            new JobPost(3,"JS","Js Dev Description",3,new ArrayList<>(Arrays.asList("JS","html")))
    ));

    public List<JobPost> getAllJobs() {
        return jobPostList;
    }
    public void addJob(JobPost jobPost) {
        jobPostList.add(jobPost);
        System.out.println("After adding , jobPost = " + jobPostList);
    }
}
