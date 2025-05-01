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


val Iconsax.Filled.CommandSquare: ImageVector
    get() {
        if (_CommandSquare != null) {
            return _CommandSquare!!
        }
        _CommandSquare = ImageVector.Builder(
            name = "Filled.CommandSquare",
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
                moveTo(9.6f, 16.2f)
                curveTo(9.6f, 17.19f, 8.79f, 18f, 7.8f, 18f)
                curveTo(6.81f, 18f, 6f, 17.19f, 6f, 16.2f)
                curveTo(6f, 15.21f, 6.81f, 14.4f, 7.8f, 14.4f)
                horizontalLineTo(8.6f)
                curveTo(9.15f, 14.4f, 9.6f, 14.85f, 9.6f, 15.4f)
                verticalLineTo(16.2f)
                close()
                moveTo(9.6f, 8.6f)
                curveTo(9.6f, 9.15f, 9.15f, 9.6f, 8.6f, 9.6f)
                horizontalLineTo(7.8f)
                curveTo(6.81f, 9.6f, 6f, 8.79f, 6f, 7.8f)
                curveTo(6f, 6.81f, 6.81f, 6f, 7.8f, 6f)
                curveTo(8.79f, 6f, 9.6f, 6.81f, 9.6f, 7.8f)
                verticalLineTo(8.6f)
                close()
                moveTo(14.15f, 13.25f)
                curveTo(14.15f, 13.74f, 13.75f, 14.15f, 13.25f, 14.15f)
                horizontalLineTo(10.74f)
                curveTo(10.25f, 14.15f, 9.84f, 13.75f, 9.84f, 13.25f)
                verticalLineTo(10.74f)
                curveTo(9.84f, 10.25f, 10.24f, 9.84f, 10.74f, 9.84f)
                horizontalLineTo(13.25f)
                curveTo(13.74f, 9.84f, 14.15f, 10.24f, 14.15f, 10.74f)
                verticalLineTo(13.25f)
                close()
                moveTo(16.2f, 18f)
                curveTo(15.21f, 18f, 14.4f, 17.19f, 14.4f, 16.2f)
                verticalLineTo(15.4f)
                curveTo(14.4f, 14.85f, 14.85f, 14.4f, 15.4f, 14.4f)
                horizontalLineTo(16.2f)
                curveTo(17.19f, 14.4f, 18f, 15.21f, 18f, 16.2f)
                curveTo(18f, 17.19f, 17.19f, 18f, 16.2f, 18f)
                close()
                moveTo(16.2f, 9.6f)
                horizontalLineTo(15.4f)
                curveTo(14.85f, 9.6f, 14.4f, 9.15f, 14.4f, 8.6f)
                verticalLineTo(7.8f)
                curveTo(14.4f, 6.81f, 15.21f, 6f, 16.2f, 6f)
                curveTo(17.19f, 6f, 18f, 6.81f, 18f, 7.8f)
                curveTo(18f, 8.79f, 17.19f, 9.6f, 16.2f, 9.6f)
                close()
            }
        }.build()

        return _CommandSquare!!
    }

@Suppress("ObjectPropertyName")
private var _CommandSquare: ImageVector? = null
