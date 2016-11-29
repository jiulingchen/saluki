package com.taobao.jaket.builder;

import com.taobao.jaket.model.TypeDefinition;

import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by huangsheng.hs on 2015/1/27.
 */
public interface TypeBuilder {

    /**
     * Whether the build accept the type or class passed in.
     */
    boolean accept(Type type, Class<?> clazz);

    /**
     * Build type definition with the type or class.
     */
    TypeDefinition build(Type type, Class<?> clazz, Map<Class<?>, TypeDefinition> typeCache);

}
