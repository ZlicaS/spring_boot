/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package njt.repository;

import njt.entity.StavkaZahteva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lizasapsaj
 */
@Repository
public interface StavkaZahtevaRepository extends JpaRepository<StavkaZahteva, Integer>{
    void deleteByZahtevSifraZahteva(int idZahteva);
}