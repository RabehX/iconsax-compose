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


val Iconsax.Filled.Fatrows: ImageVector
    get() {
        if (_Fatrows != null) {
            return _Fatrows!!
        }
        _Fatrows = ImageVector.Builder(
            name = "Filled.Fatrows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.9f, 13.5f)
                horizontalLineTo(4.1f)
                curveTo(2.6f, 13.5f, 2f, 14.14f, 2f, 15.73f)
                verticalLineTo(19.77f)
                curveTo(2f, 21.36f, 2.6f, 22f, 4.1f, 22f)
                horizontalLineTo(19.9f)
                curveTo(21.4f, 22f, 22f, 21.36f, 22f, 19.77f)
                verticalLineTo(15.73f)
                curveTo(22f, 14.14f, 21.4f, 13.5f, 19.9f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.9f, 2f)
                horizontalLineTo(4.1f)
                curveTo(2.6f, 2f, 2f, 2.64f, 2f, 4.23f)
                verticalLineTo(8.27f)
                curveTo(2f, 9.86f, 2.6f, 10.5f, 4.1f, 10.5f)
                horizontalLineTo(12.9f)
                curveTo(14.4f, 10.5f, 15f, 9.86f, 15f, 8.27f)
                verticalLineTo(4.23f)
                curveTo(15f, 2.64f, 14.4f, 2f, 12.9f, 2f)
                close()
            }
        }.build()

        return _Fatrows!!
    }

@Suppress("ObjectPropertyName")
private var _Fatrows: ImageVector? = null
