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


val Iconsax.Filled.Shapes1: ImageVector
    get() {
        if (_Shapes1 != null) {
            return _Shapes1!!
        }
        _Shapes1 = ImageVector.Builder(
            name = "Filled.Shapes1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.75f, 7f)
                horizontalLineTo(11f)
                horizontalLineTo(7f)
                curveTo(4.24f, 7f, 2f, 9.24f, 2f, 12f)
                verticalLineTo(17f)
                curveTo(2f, 19.76f, 4.24f, 22f, 7f, 22f)
                horizontalLineTo(12f)
                curveTo(14.76f, 22f, 17f, 19.76f, 17f, 17f)
                verticalLineTo(13f)
                verticalLineTo(12.25f)
                curveTo(17f, 9.35f, 14.65f, 7f, 11.75f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.881f, 6.33f)
                curveTo(22.405f, 8.89f, 21.163f, 11.212f, 19.16f, 12.306f)
                curveTo(18.852f, 12.474f, 18.501f, 12.234f, 18.501f, 11.884f)
                verticalLineTo(11.75f)
                curveTo(18.501f, 8.31f, 15.691f, 5.5f, 12.251f, 5.5f)
                horizontalLineTo(12.117f)
                curveTo(11.767f, 5.5f, 11.527f, 5.149f, 11.695f, 4.841f)
                curveTo(12.789f, 2.838f, 15.111f, 1.596f, 17.671f, 2.12f)
                curveTo(19.761f, 2.55f, 21.451f, 4.24f, 21.881f, 6.33f)
                close()
            }
        }.build()

        return _Shapes1!!
    }

@Suppress("ObjectPropertyName")
private var _Shapes1: ImageVector? = null
