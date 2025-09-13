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

val Iconsax.Outline.BackwardItem: ImageVector
    get() {
        if (_BackwardItem != null) {
            return _BackwardItem!!
        }
        _BackwardItem = ImageVector.Builder(
            name = "Outline.BackwardItem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.85f, 11.75f)
                horizontalLineTo(16.15f)
                curveTo(13.49f, 11.75f, 12.25f, 10.51f, 12.25f, 7.85f)
                verticalLineTo(5.15f)
                curveTo(12.25f, 2.49f, 13.49f, 1.25f, 16.15f, 1.25f)
                horizontalLineTo(18.85f)
                curveTo(21.51f, 1.25f, 22.75f, 2.49f, 22.75f, 5.15f)
                verticalLineTo(7.85f)
                curveTo(22.75f, 10.51f, 21.51f, 11.75f, 18.85f, 11.75f)
                close()
                moveTo(16.15f, 2.75f)
                curveTo(14.31f, 2.75f, 13.75f, 3.31f, 13.75f, 5.15f)
                verticalLineTo(7.85f)
                curveTo(13.75f, 9.69f, 14.31f, 10.25f, 16.15f, 10.25f)
                horizontalLineTo(18.85f)
                curveTo(20.69f, 10.25f, 21.25f, 9.69f, 21.25f, 7.85f)
                verticalLineTo(5.15f)
                curveTo(21.25f, 3.31f, 20.69f, 2.75f, 18.85f, 2.75f)
                horizontalLineTo(16.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.85f, 22.75f)
                horizontalLineTo(5.15f)
                curveTo(2.49f, 22.75f, 1.25f, 21.51f, 1.25f, 18.85f)
                verticalLineTo(16.15f)
                curveTo(1.25f, 13.49f, 2.49f, 12.25f, 5.15f, 12.25f)
                horizontalLineTo(7.85f)
                curveTo(10.51f, 12.25f, 11.75f, 13.49f, 11.75f, 16.15f)
                verticalLineTo(18.85f)
                curveTo(11.75f, 21.51f, 10.51f, 22.75f, 7.85f, 22.75f)
                close()
                moveTo(5.15f, 13.75f)
                curveTo(3.31f, 13.75f, 2.75f, 14.31f, 2.75f, 16.15f)
                verticalLineTo(18.85f)
                curveTo(2.75f, 20.69f, 3.31f, 21.25f, 5.15f, 21.25f)
                horizontalLineTo(7.85f)
                curveTo(9.69f, 21.25f, 10.25f, 20.69f, 10.25f, 18.85f)
                verticalLineTo(16.15f)
                curveTo(10.25f, 14.31f, 9.69f, 13.75f, 7.85f, 13.75f)
                horizontalLineTo(5.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.621f, 18.13f)
                horizontalLineTo(11.001f)
                curveTo(10.591f, 18.13f, 10.251f, 17.79f, 10.251f, 17.38f)
                verticalLineTo(16.15f)
                curveTo(10.251f, 14.31f, 9.691f, 13.75f, 7.851f, 13.75f)
                horizontalLineTo(6.621f)
                curveTo(6.211f, 13.75f, 5.871f, 13.41f, 5.871f, 13f)
                verticalLineTo(10.38f)
                curveTo(5.871f, 7.26f, 7.261f, 5.87f, 10.381f, 5.87f)
                horizontalLineTo(13.001f)
                curveTo(13.411f, 5.87f, 13.751f, 6.21f, 13.751f, 6.62f)
                verticalLineTo(7.85f)
                curveTo(13.751f, 9.69f, 14.311f, 10.25f, 16.151f, 10.25f)
                horizontalLineTo(17.381f)
                curveTo(17.791f, 10.25f, 18.131f, 10.59f, 18.131f, 11f)
                verticalLineTo(13.62f)
                curveTo(18.131f, 16.74f, 16.741f, 18.13f, 13.621f, 18.13f)
                close()
                moveTo(11.751f, 16.63f)
                horizontalLineTo(13.621f)
                curveTo(15.901f, 16.63f, 16.631f, 15.9f, 16.631f, 13.62f)
                verticalLineTo(11.75f)
                horizontalLineTo(16.151f)
                curveTo(13.491f, 11.75f, 12.251f, 10.51f, 12.251f, 7.85f)
                verticalLineTo(7.37f)
                horizontalLineTo(10.381f)
                curveTo(8.101f, 7.37f, 7.371f, 8.1f, 7.371f, 10.38f)
                verticalLineTo(12.25f)
                horizontalLineTo(7.851f)
                curveTo(10.511f, 12.25f, 11.751f, 13.49f, 11.751f, 16.15f)
                verticalLineTo(16.63f)
                close()
            }
        }.build()

        return _BackwardItem!!
    }

@Suppress("ObjectPropertyName")
private var _BackwardItem: ImageVector? = null
