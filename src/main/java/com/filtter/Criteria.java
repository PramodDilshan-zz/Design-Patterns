package com.filtter;

import java.util.List;

/**
 * Created by pramod_dilshan on 8/30/18.
 */
public interface Criteria<T> {
    List<T> filtter(List<T> list);
}
