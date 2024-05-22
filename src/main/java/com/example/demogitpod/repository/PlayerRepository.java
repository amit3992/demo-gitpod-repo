package com.example.demogitpod.repository;
import com.example.demogitpod.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, String> {

}
