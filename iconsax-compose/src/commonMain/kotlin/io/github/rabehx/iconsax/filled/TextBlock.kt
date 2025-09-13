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


val Iconsax.Filled.TextBlock: ImageVector
    get() {
        if (_TextBlock != null) {
            return _TextBlock!!
        }
        _TextBlock = ImageVector.Builder(
            name = "Filled.TextBlock",
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
                moveTo(17.67f, 9.22f)
                curveTo(17.48f, 9.59f, 17.04f, 9.74f, 16.66f, 9.56f)
                curveTo(15.43f, 8.94f, 14.1f, 8.6f, 12.75f, 8.5f)
                verticalLineTo(16.29f)
                curveTo(12.75f, 16.7f, 12.41f, 17.04f, 12f, 17.04f)
                curveTo(11.59f, 17.04f, 11.25f, 16.7f, 11.25f, 16.29f)
                verticalLineTo(8.5f)
                curveTo(9.9f, 8.6f, 8.57f, 8.94f, 7.34f, 9.56f)
                curveTo(7.23f, 9.61f, 7.11f, 9.63f, 7f, 9.63f)
                curveTo(6.73f, 9.63f, 6.46f, 9.48f, 6.33f, 9.22f)
                curveTo(6.14f, 8.85f, 6.29f, 8.4f, 6.66f, 8.21f)
                curveTo(10f, 6.54f, 13.99f, 6.54f, 17.33f, 8.21f)
                curveTo(17.71f, 8.4f, 17.86f, 8.85f, 17.67f, 9.22f)
                close()
            }
        }.build()

        return _TextBlock!!
    }

@Suppress("ObjectPropertyName")
private var _TextBlock: ImageVector? = null
