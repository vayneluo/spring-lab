package me.lattice.spring.batch.service;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import me.lattice.spring.batch.entity.DuckUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: Lattice
 * @date 2022/7/7 09:45
 */
@Service
public class RandomUserService {
    public List<DuckUser> randomUser() {
        List<DuckUser> duckUsers = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            DuckUser user = new DuckUser();
            user.setOpenId(IdUtil.fastSimpleUUID());
            user.setUnionId(IdUtil.fastSimpleUUID());
            user.setAvatarUrl("https://lattice.vip/" + RandomUtil.randomString(6));
            user.setGender(RandomUtil.randomInt(1));
            user.setNickname(RandomUtil.randomString(5));
            user.setSource(10);
            duckUsers.add(user);
        }
        return duckUsers;
    }
}
