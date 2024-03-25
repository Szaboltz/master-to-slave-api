package com.mastertoslave.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mastertoslave.demo.annotation.ReadOnlyRepository;
import com.mastertoslave.demo.modals.ClienteModal;

@Repository
@ReadOnlyRepository
public interface ClienteReadOnlyRepository extends JpaRepository<ClienteModal, Long> {
}