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


val Iconsax.Filled.Computing: ImageVector
    get() {
        if (_Computing != null) {
            return _Computing!!
        }
        _Computing = ImageVector.Builder(
            name = "Filled.Computing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.951f, 4.129f)
                lineTo(4.131f, 20.949f)
                curveTo(5.081f, 21.639f, 6.321f, 21.999f, 7.811f, 21.999f)
                horizontalLineTo(16.191f)
                curveTo(19.831f, 21.999f, 22.001f, 19.829f, 22.001f, 16.189f)
                verticalLineTo(7.809f)
                curveTo(22.001f, 6.319f, 21.641f, 5.079f, 20.951f, 4.129f)
                close()
                moveTo(18.501f, 16.249f)
                horizontalLineTo(16.811f)
                verticalLineTo(17.999f)
                curveTo(16.811f, 18.409f, 16.471f, 18.749f, 16.061f, 18.749f)
                curveTo(15.651f, 18.749f, 15.311f, 18.409f, 15.311f, 17.999f)
                verticalLineTo(16.249f)
                horizontalLineTo(13.501f)
                curveTo(13.091f, 16.249f, 12.751f, 15.909f, 12.751f, 15.499f)
                curveTo(12.751f, 15.089f, 13.091f, 14.749f, 13.501f, 14.749f)
                horizontalLineTo(15.311f)
                verticalLineTo(12.999f)
                curveTo(15.311f, 12.589f, 15.651f, 12.249f, 16.061f, 12.249f)
                curveTo(16.471f, 12.249f, 16.811f, 12.589f, 16.811f, 12.999f)
                verticalLineTo(14.749f)
                horizontalLineTo(18.501f)
                curveTo(18.911f, 14.749f, 19.251f, 15.089f, 19.251f, 15.499f)
                curveTo(19.251f, 15.909f, 18.911f, 16.249f, 18.501f, 16.249f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.19f)
                curveTo(2f, 17.68f, 2.36f, 18.92f, 3.05f, 19.87f)
                lineTo(19.87f, 3.05f)
                curveTo(18.92f, 2.36f, 17.68f, 2f, 16.19f, 2f)
                close()
                moveTo(10.5f, 8.25f)
                horizontalLineTo(5.5f)
                curveTo(5.09f, 8.25f, 4.75f, 7.91f, 4.75f, 7.5f)
                curveTo(4.75f, 7.09f, 5.09f, 6.75f, 5.5f, 6.75f)
                horizontalLineTo(10.5f)
                curveTo(10.91f, 6.75f, 11.25f, 7.09f, 11.25f, 7.5f)
                curveTo(11.25f, 7.91f, 10.91f, 8.25f, 10.5f, 8.25f)
                close()
            }
        }.build()

        return _Computing!!
    }

@Suppress("ObjectPropertyName")
private var _Computing: ImageVector? = null
