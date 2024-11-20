package com.home.shop.item;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/** 1.리포지토리(인터페이스) 만들기
 *  - 파일명 관습 : 입출력할 Entity name + Repository >> ItemRepository
 *  - public interface 만들기
 *  - <a, b> : a == 입출력할 Entity, b == Entity id column type
 */
public interface ItemRepository extends JpaRepository<Item, Long> {

    Page<Item> findPageBy(Pageable page);

}
