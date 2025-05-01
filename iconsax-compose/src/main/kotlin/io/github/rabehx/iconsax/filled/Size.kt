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


val Iconsax.Filled.Size: ImageVector
    get() {
        if (_Size != null) {
            return _Size!!
        }
        _Size = ImageVector.Builder(
            name = "Filled.Size",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.971f, 5.5f)
                verticalLineTo(9.5f)
                curveTo(21.971f, 11.262f, 20.671f, 12.723f, 18.969f, 12.965f)
                curveTo(18.696f, 13.004f, 18.471f, 12.776f, 18.471f, 12.5f)
                verticalLineTo(12.25f)
                curveTo(18.471f, 8.53f, 15.451f, 5.5f, 11.721f, 5.5f)
                horizontalLineTo(11.471f)
                curveTo(11.195f, 5.5f, 10.967f, 5.275f, 11.006f, 5.002f)
                curveTo(11.249f, 3.307f, 12.71f, 2f, 14.471f, 2f)
                horizontalLineTo(18.471f)
                curveTo(20.411f, 2f, 21.971f, 3.57f, 21.971f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.721f, 7f)
                horizontalLineTo(10.971f)
                horizontalLineTo(6.971f)
                curveTo(4.211f, 7f, 1.971f, 9.24f, 1.971f, 12f)
                verticalLineTo(17f)
                curveTo(1.971f, 19.76f, 4.211f, 22f, 6.971f, 22f)
                horizontalLineTo(11.971f)
                curveTo(14.731f, 22f, 16.971f, 19.76f, 16.971f, 17f)
                verticalLineTo(13f)
                verticalLineTo(12.25f)
                curveTo(16.971f, 9.35f, 14.621f, 7f, 11.721f, 7f)
                close()
            }
        }.build()

        return _Size!!
    }

@Suppress("ObjectPropertyName")
private var _Size: ImageVector? = null
