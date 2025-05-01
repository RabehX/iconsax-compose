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


val Iconsax.Filled.MessageSquare: ImageVector
    get() {
        if (_MessageSquare != null) {
            return _MessageSquare!!
        }
        _MessageSquare = ImageVector.Builder(
            name = "Filled.MessageSquare",
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
                moveTo(18.28f, 12.91f)
                curveTo(18.28f, 13.11f, 18.27f, 13.31f, 18.25f, 13.5f)
                curveTo(18.07f, 15.62f, 16.82f, 16.68f, 14.52f, 16.68f)
                horizontalLineTo(14.2f)
                curveTo(14f, 16.68f, 13.81f, 16.77f, 13.7f, 16.93f)
                lineTo(12.76f, 18.19f)
                curveTo(12.34f, 18.75f, 11.67f, 18.75f, 11.25f, 18.19f)
                lineTo(10.31f, 16.93f)
                curveTo(10.21f, 16.8f, 9.98f, 16.68f, 9.81f, 16.68f)
                horizontalLineTo(9.49f)
                curveTo(6.98f, 16.68f, 5.73f, 16.06f, 5.73f, 12.92f)
                verticalLineTo(9.76f)
                curveTo(5.73f, 7.46f, 6.79f, 6.21f, 8.91f, 6.03f)
                curveTo(9.08f, 6.01f, 9.28f, 6f, 9.49f, 6f)
                horizontalLineTo(14.52f)
                curveTo(17.03f, 6f, 18.28f, 7.26f, 18.28f, 9.76f)
                verticalLineTo(12.91f)
                close()
            }
        }.build()

        return _MessageSquare!!
    }

@Suppress("ObjectPropertyName")
private var _MessageSquare: ImageVector? = null
