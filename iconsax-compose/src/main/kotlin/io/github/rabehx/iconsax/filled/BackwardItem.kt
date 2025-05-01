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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Filled.BackwardItem: ImageVector
    get() {
        if (_BackwardItem != null) {
            return _BackwardItem!!
        }
        _BackwardItem = ImageVector.Builder(
            name = "Filled.BackwardItem",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.25f, 5.15f)
                verticalLineTo(7.85f)
                curveTo(21.25f, 9.69f, 20.69f, 10.25f, 18.85f, 10.25f)
                horizontalLineTo(16.15f)
                curveTo(14.31f, 10.25f, 13.75f, 9.69f, 13.75f, 7.85f)
                verticalLineTo(5.15f)
                curveTo(13.75f, 3.31f, 14.31f, 2.75f, 16.15f, 2.75f)
                horizontalLineTo(18.85f)
                curveTo(20.69f, 2.75f, 21.25f, 3.31f, 21.25f, 5.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.25f, 16.15f)
                verticalLineTo(18.85f)
                curveTo(10.25f, 20.69f, 9.69f, 21.25f, 7.85f, 21.25f)
                horizontalLineTo(5.15f)
                curveTo(3.31f, 21.25f, 2.75f, 20.69f, 2.75f, 18.85f)
                verticalLineTo(16.15f)
                curveTo(2.75f, 14.31f, 3.31f, 13.75f, 5.15f, 13.75f)
                horizontalLineTo(7.85f)
                curveTo(9.69f, 13.75f, 10.25f, 14.31f, 10.25f, 16.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.149f, 11.751f)
                curveTo(16.414f, 11.751f, 16.629f, 11.966f, 16.629f, 12.231f)
                verticalLineTo(13.621f)
                curveTo(16.629f, 15.901f, 15.899f, 16.631f, 13.619f, 16.631f)
                horizontalLineTo(12.229f)
                curveTo(11.964f, 16.631f, 11.749f, 16.416f, 11.749f, 16.151f)
                curveTo(11.749f, 13.491f, 10.509f, 12.251f, 7.849f, 12.251f)
                curveTo(7.584f, 12.251f, 7.369f, 12.036f, 7.369f, 11.771f)
                verticalLineTo(10.381f)
                curveTo(7.369f, 8.101f, 8.099f, 7.371f, 10.379f, 7.371f)
                horizontalLineTo(11.769f)
                curveTo(12.034f, 7.371f, 12.249f, 7.586f, 12.249f, 7.851f)
                curveTo(12.249f, 10.511f, 13.489f, 11.751f, 16.149f, 11.751f)
                close()
            }
        }.build()

        return _BackwardItem!!
    }

@Suppress("ObjectPropertyName")
private var _BackwardItem: ImageVector? = null
