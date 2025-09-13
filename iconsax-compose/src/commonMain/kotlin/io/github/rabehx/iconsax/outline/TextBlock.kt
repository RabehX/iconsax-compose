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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.TextBlock: ImageVector
    get() {
        if (_TextBlock != null) {
            return _TextBlock!!
        }
        _TextBlock = ImageVector.Builder(
            name = "Outline.TextBlock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.001f, 9.63f)
                curveTo(6.731f, 9.63f, 6.461f, 9.48f, 6.331f, 9.22f)
                curveTo(6.141f, 8.85f, 6.291f, 8.4f, 6.661f, 8.21f)
                curveTo(10f, 6.54f, 13.991f, 6.54f, 17.33f, 8.21f)
                curveTo(17.701f, 8.4f, 17.851f, 8.85f, 17.67f, 9.22f)
                curveTo(17.48f, 9.59f, 17.041f, 9.74f, 16.66f, 9.56f)
                curveTo(13.741f, 8.1f, 10.25f, 8.1f, 7.331f, 9.56f)
                curveTo(7.231f, 9.61f, 7.111f, 9.63f, 7.001f, 9.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.04f)
                curveTo(11.59f, 17.04f, 11.25f, 16.7f, 11.25f, 16.29f)
                verticalLineTo(7.93f)
                curveTo(11.25f, 7.52f, 11.59f, 7.18f, 12f, 7.18f)
                curveTo(12.41f, 7.18f, 12.75f, 7.52f, 12.75f, 7.93f)
                verticalLineTo(16.3f)
                curveTo(12.75f, 16.71f, 12.41f, 17.04f, 12f, 17.04f)
                close()
            }
        }.build()

        return _TextBlock!!
    }

@Suppress("ObjectPropertyName")
private var _TextBlock: ImageVector? = null
