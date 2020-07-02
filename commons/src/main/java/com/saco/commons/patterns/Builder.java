package com.saco.commons.patterns;

/**
 * Builder Pattern Interface
 * 값이 변하지 않는 객체를 생성할 때 사용.
 * @author sadocode
 * @param <T> 클래스명 
 */
public interface Builder<T> {
	public T build();
}
