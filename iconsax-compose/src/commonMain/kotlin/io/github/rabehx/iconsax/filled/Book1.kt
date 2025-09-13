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


val Iconsax.Filled.Book1: ImageVector
    get() {
        if (_Book1 != null) {
            return _Book1!!
        }
        _Book1 = ImageVector.Builder(
            name = "Filled.Book1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 4.85f)
                verticalLineTo(16.74f)
                curveTo(22f, 17.71f, 21.21f, 18.6f, 20.24f, 18.72f)
                lineTo(19.93f, 18.76f)
                curveTo(18.29f, 18.98f, 15.98f, 19.66f, 14.12f, 20.44f)
                curveTo(13.47f, 20.71f, 12.75f, 20.22f, 12.75f, 19.51f)
                verticalLineTo(5.6f)
                curveTo(12.75f, 5.23f, 12.96f, 4.89f, 13.29f, 4.71f)
                curveTo(15.12f, 3.72f, 17.89f, 2.84f, 19.77f, 2.68f)
                horizontalLineTo(19.83f)
                curveTo(21.03f, 2.68f, 22f, 3.65f, 22f, 4.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.708f, 4.71f)
                curveTo(8.878f, 3.72f, 6.108f, 2.84f, 4.228f, 2.68f)
                horizontalLineTo(4.158f)
                curveTo(2.958f, 2.68f, 1.988f, 3.65f, 1.988f, 4.85f)
                verticalLineTo(16.74f)
                curveTo(1.988f, 17.71f, 2.778f, 18.6f, 3.748f, 18.72f)
                lineTo(4.058f, 18.76f)
                curveTo(5.698f, 18.98f, 8.008f, 19.66f, 9.868f, 20.44f)
                curveTo(10.518f, 20.71f, 11.238f, 20.22f, 11.238f, 19.51f)
                verticalLineTo(5.6f)
                curveTo(11.238f, 5.22f, 11.038f, 4.89f, 10.708f, 4.71f)
                close()
                moveTo(4.998f, 7.74f)
                horizontalLineTo(7.248f)
                curveTo(7.658f, 7.74f, 7.998f, 8.08f, 7.998f, 8.49f)
                curveTo(7.998f, 8.91f, 7.658f, 9.24f, 7.248f, 9.24f)
                horizontalLineTo(4.998f)
                curveTo(4.588f, 9.24f, 4.248f, 8.91f, 4.248f, 8.49f)
                curveTo(4.248f, 8.08f, 4.588f, 7.74f, 4.998f, 7.74f)
                close()
                moveTo(7.998f, 12.24f)
                horizontalLineTo(4.998f)
                curveTo(4.588f, 12.24f, 4.248f, 11.91f, 4.248f, 11.49f)
                curveTo(4.248f, 11.08f, 4.588f, 10.74f, 4.998f, 10.74f)
                horizontalLineTo(7.998f)
                curveTo(8.408f, 10.74f, 8.748f, 11.08f, 8.748f, 11.49f)
                curveTo(8.748f, 11.91f, 8.408f, 12.24f, 7.998f, 12.24f)
                close()
            }
        }.build()

        return _Book1!!
    }

@Suppress("ObjectPropertyName")
private var _Book1: ImageVector? = null
