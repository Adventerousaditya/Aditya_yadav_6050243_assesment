package com.example.movieTrackAPI.repo;

import com.example.movieTrackAPI.entity.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TrackRepository extends JpaRepository<Track, Long> {
	
    List<Track> findByTitle(String title);
}