/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.GridLock: ImageVector
    get() {
        if (_GridLock != null) {
            return _GridLock!!
        }
        _GridLock = ImageVector.Builder(
            name = "Outline.GridLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(11f)
                curveTo(22.75f, 11.41f, 22.41f, 11.75f, 22f, 11.75f)
                curveTo(21.59f, 11.75f, 21.25f, 11.41f, 21.25f, 11f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(10f)
                curveTo(10.41f, 21.25f, 10.75f, 21.59f, 10.75f, 22f)
                curveTo(10.75f, 22.41f, 10.41f, 22.75f, 10f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22.001f, 9.25f)
                horizontalLineTo(2.031f)
                curveTo(1.621f, 9.25f, 1.281f, 8.91f, 1.281f, 8.5f)
                curveTo(1.281f, 8.09f, 1.621f, 7.75f, 2.031f, 7.75f)
                horizontalLineTo(22.001f)
                curveTo(22.411f, 7.75f, 22.751f, 8.09f, 22.751f, 8.5f)
                curveTo(22.751f, 8.91f, 22.411f, 9.25f, 22.001f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 16.25f)
                horizontalLineTo(2.031f)
                curveTo(1.621f, 16.25f, 1.281f, 15.91f, 1.281f, 15.5f)
                curveTo(1.281f, 15.09f, 1.621f, 14.75f, 2.031f, 14.75f)
                horizontalLineTo(12.001f)
                curveTo(12.411f, 14.75f, 12.751f, 15.09f, 12.751f, 15.5f)
                curveTo(12.751f, 15.91f, 12.411f, 16.25f, 12.001f, 16.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.51f, 22.74f)
                curveTo(8.1f, 22.74f, 7.76f, 22.4f, 7.76f, 21.99f)
                verticalLineTo(2.02f)
                curveTo(7.76f, 1.61f, 8.1f, 1.27f, 8.51f, 1.27f)
                curveTo(8.92f, 1.27f, 9.26f, 1.61f, 9.26f, 2.02f)
                verticalLineTo(21.99f)
                curveTo(9.26f, 22.4f, 8.93f, 22.74f, 8.51f, 22.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.51f, 12.74f)
                curveTo(15.1f, 12.74f, 14.76f, 12.4f, 14.76f, 11.99f)
                verticalLineTo(2.02f)
                curveTo(14.76f, 1.61f, 15.1f, 1.27f, 15.51f, 1.27f)
                curveTo(15.92f, 1.27f, 16.26f, 1.61f, 16.26f, 2.02f)
                verticalLineTo(11.99f)
                curveTo(16.26f, 12.4f, 15.93f, 12.74f, 15.51f, 12.74f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.4f, 17.95f)
                curveTo(19.99f, 17.95f, 19.65f, 17.61f, 19.65f, 17.2f)
                verticalLineTo(16.4f)
                curveTo(19.65f, 15.28f, 19.4f, 14.75f, 18f, 14.75f)
                curveTo(16.6f, 14.75f, 16.35f, 15.28f, 16.35f, 16.4f)
                verticalLineTo(17.2f)
                curveTo(16.35f, 17.61f, 16.01f, 17.95f, 15.6f, 17.95f)
                curveTo(15.19f, 17.95f, 14.85f, 17.61f, 14.85f, 17.2f)
                verticalLineTo(16.4f)
                curveTo(14.85f, 14.31f, 15.91f, 13.25f, 18f, 13.25f)
                curveTo(20.09f, 13.25f, 21.15f, 14.31f, 21.15f, 16.4f)
                verticalLineTo(17.2f)
                curveTo(21.15f, 17.61f, 20.81f, 17.95f, 20.4f, 17.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 22.75f)
                horizontalLineTo(16f)
                curveTo(14f, 22.75f, 13.25f, 22f, 13.25f, 20f)
                verticalLineTo(19.2f)
                curveTo(13.25f, 17.2f, 14f, 16.45f, 16f, 16.45f)
                horizontalLineTo(20f)
                curveTo(22f, 16.45f, 22.75f, 17.2f, 22.75f, 19.2f)
                verticalLineTo(20f)
                curveTo(22.75f, 22f, 22f, 22.75f, 20f, 22.75f)
                close()
                moveTo(16f, 17.95f)
                curveTo(14.81f, 17.95f, 14.75f, 18.01f, 14.75f, 19.2f)
                verticalLineTo(20f)
                curveTo(14.75f, 21.18f, 14.82f, 21.25f, 16f, 21.25f)
                horizontalLineTo(20f)
                curveTo(21.18f, 21.25f, 21.25f, 21.18f, 21.25f, 20f)
                verticalLineTo(19.2f)
                curveTo(21.25f, 18.01f, 21.19f, 17.95f, 20f, 17.95f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _GridLock!!
    }

@Suppress("ObjectPropertyName")
private var _GridLock: ImageVector? = null
