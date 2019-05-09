package com.sun.cleanpractice.model.base

import com.sun.domain.model.base.Model

interface ItemMapper<M : Model, MI : ModelItem> {
    fun mapToPresentation(model: M): MI

    fun mapToDomain(modelItem: MI): M
}
