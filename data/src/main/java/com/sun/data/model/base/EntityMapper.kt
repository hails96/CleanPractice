package com.sun.data.model.base

import com.sun.domain.model.base.Model

interface EntityMapper<M : Model, ME : ModelEntity> {
    fun mapToDomain(entity: ME): M

    fun mapToEntity(model: M): ME
}