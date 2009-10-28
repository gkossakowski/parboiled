package org.parboiled.utils;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * A simple, immutable DGraphNode implementation.
 * @param <T>
 */
public class ImmutableDGraphNode<T extends DGraphNode<T>> implements DGraphNode<T> {

    @NotNull private final List<T> children;

    public ImmutableDGraphNode() {
        this(null);
    }

    public ImmutableDGraphNode(List<T> children) {
        this.children = children != null ? ImmutableList.copyOf(children) : ImmutableList.<T>of();
    }

    @NotNull
    public List<T> getChildren() {
        return children;
    }

}
