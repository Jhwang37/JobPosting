package com.example.craigslistclone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    jobRespository jobRespository;

    @Override
    public void run(String ... strings) throws Exception{
        Job job;
        job = new Job("Software Engineer","James", "555-555-555", "Locavore mixtape farm-to-table pork belly copper mug selvage shabby chic artisan try-hard wayfarers. Pitchfork cliche blog hexagon pour-over ramps. DIY vexillologist paleo banh mi godam.");
        jobRespository.save(job);
        job = new Job("Clerk","James", "555-555-555", "Locavore mixtape farm-to-table pork belly copper mug selvage shabby chic artisan try-hard wayfarers. Pitchfork cliche blog hexagon pour-over ramps. DIY vexillologist paleo banh mi godam.");
        jobRespository.save(job);
        job = new Job("Data Analyst","James", "555-555-555", "Locavore mixtape farm-to-table pork belly copper mug selvage shabby chic artisan try-hard wayfarers. Pitchfork cliche blog hexagon pour-over ramps. DIY vexillologist paleo banh mi godam.");
        jobRespository.save(job);
        job = new Job("Web Developer","James", "555-555-555", "Locavore mixtape farm-to-table pork belly copper mug selvage shabby chic artisan try-hard wayfarers. Pitchfork cliche blog hexagon pour-over ramps. DIY vexillologist paleo banh mi godam.");
        jobRespository.save(job);
        job = new Job("Cashier","James", "555-555-555", "Locavore mixtape farm-to-table pork belly copper mug selvage shabby chic artisan try-hard wayfarers. Pitchfork cliche blog hexagon pour-over ramps. DIY vexillologist paleo banh mi godam.");
        jobRespository.save(job);
        job = new Job("Financial Advisor","James", "555-555-555", "Locavore mixtape farm-to-table pork belly copper mug selvage shabby chic artisan try-hard wayfarers. Pitchfork cliche blog hexagon pour-over ramps. DIY vexillologist paleo banh mi godam.");
        jobRespository.save(job);
        job = new Job("Project Leader","James", "555-555-555", "Locavore mixtape farm-to-table pork belly copper mug selvage shabby chic artisan try-hard wayfarers. Pitchfork cliche blog hexagon pour-over ramps. DIY vexillologist paleo banh mi godam.");
        jobRespository.save(job);


    }
}