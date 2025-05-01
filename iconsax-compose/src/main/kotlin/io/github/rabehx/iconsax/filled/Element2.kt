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


val Iconsax.Filled.Element2: ImageVector
    get() {
        if (_Element2 != null) {
            return _Element2!!
        }
        _Element2 = ImageVector.Builder(
            name = "Filled.Element2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 19.9f)
                verticalLineTo(4.1f)
                curveTo(11f, 2.6f, 10.36f, 2f, 8.77f, 2f)
                horizontalLineTo(4.73f)
                curveTo(3.14f, 2f, 2.5f, 2.6f, 2.5f, 4.1f)
                verticalLineTo(19.9f)
                curveTo(2.5f, 21.4f, 3.14f, 22f, 4.73f, 22f)
                horizontalLineTo(8.77f)
                curveTo(10.36f, 22f, 11f, 21.4f, 11f, 19.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.5f, 10.9f)
                verticalLineTo(4.1f)
                curveTo(21.5f, 2.6f, 20.86f, 2f, 19.27f, 2f)
                horizontalLineTo(15.23f)
                curveTo(13.64f, 2f, 13f, 2.6f, 13f, 4.1f)
                verticalLineTo(10.9f)
                curveTo(13f, 12.4f, 13.64f, 13f, 15.23f, 13f)
                horizontalLineTo(19.27f)
                curveTo(20.86f, 13f, 21.5f, 12.4f, 21.5f, 10.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.5f, 19.9f)
                verticalLineTo(17.1f)
                curveTo(21.5f, 15.6f, 20.86f, 15f, 19.27f, 15f)
                horizontalLineTo(15.23f)
                curveTo(13.64f, 15f, 13f, 15.6f, 13f, 17.1f)
                verticalLineTo(19.9f)
                curveTo(13f, 21.4f, 13.64f, 22f, 15.23f, 22f)
                horizontalLineTo(19.27f)
                curveTo(20.86f, 22f, 21.5f, 21.4f, 21.5f, 19.9f)
                close()
            }
        }.build()

        return _Element2!!
    }

@Suppress("ObjectPropertyName")
private var _Element2: ImageVector? = null
