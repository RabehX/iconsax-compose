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


val Iconsax.Filled.Document: ImageVector
    get() {
        if (_Document != null) {
            return _Document!!
        }
        _Document = ImageVector.Builder(
            name = "Filled.Document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(15.75f, 15.75f)
                horizontalLineTo(8.25f)
                curveTo(7.84f, 15.75f, 7.5f, 15.41f, 7.5f, 15f)
                curveTo(7.5f, 14.59f, 7.84f, 14.25f, 8.25f, 14.25f)
                horizontalLineTo(15.75f)
                curveTo(16.16f, 14.25f, 16.5f, 14.59f, 16.5f, 15f)
                curveTo(16.5f, 15.41f, 16.16f, 15.75f, 15.75f, 15.75f)
                close()
                moveTo(15.75f, 9.75f)
                horizontalLineTo(8.25f)
                curveTo(7.84f, 9.75f, 7.5f, 9.41f, 7.5f, 9f)
                curveTo(7.5f, 8.59f, 7.84f, 8.25f, 8.25f, 8.25f)
                horizontalLineTo(15.75f)
                curveTo(16.16f, 8.25f, 16.5f, 8.59f, 16.5f, 9f)
                curveTo(16.5f, 9.41f, 16.16f, 9.75f, 15.75f, 9.75f)
                close()
            }
        }.build()

        return _Document!!
    }

@Suppress("ObjectPropertyName")
private var _Document: ImageVector? = null
