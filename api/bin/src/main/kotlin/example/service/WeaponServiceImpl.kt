package example.service;

import example.model.Weapon;
import example.repository.WeaponRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ragcrix
 */
@Service
class WeaponServiceImpl : WeaponService {

  @Autowired
  lateinit var weaponRepository: WeaponRepository

  override fun findAll(): List<Weapon> = weaponRepository.findAll()

  override fun findByName(name: String): Weapon {
    for(w in weaponRepository.findAll())
      if(w.name == name)
        return w

    return Weapon();
  }
}
