package com.amel.usermanagement.Repository;

import com.amel.usermanagement.Model.ContactModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactModel, Long> {
}
