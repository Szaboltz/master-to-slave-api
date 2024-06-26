package com.mastertoslave.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mastertoslave.demo.modals.ClienteModal;

@Repository
public interface ClienteReadWriteRepository extends JpaRepository<ClienteModal, Long> {
}
