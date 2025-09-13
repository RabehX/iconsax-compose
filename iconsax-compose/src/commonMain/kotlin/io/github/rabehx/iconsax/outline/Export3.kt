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

val Iconsax.Outline.Export3: ImageVector
    get() {
        if (_Export3 != null) {
            return _Export3!!
        }
        _Export3 = ImageVector.Builder(
            name = "Outline.Export3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13f, 11.75f)
                curveTo(12.809f, 11.75f, 12.62f, 11.68f, 12.469f, 11.53f)
                curveTo(12.179f, 11.24f, 12.179f, 10.76f, 12.469f, 10.47f)
                lineTo(20.67f, 2.27f)
                curveTo(20.959f, 1.98f, 21.44f, 1.98f, 21.729f, 2.27f)
                curveTo(22.02f, 2.56f, 22.02f, 3.04f, 21.729f, 3.33f)
                lineTo(13.53f, 11.53f)
                curveTo(13.38f, 11.68f, 13.189f, 11.75f, 13f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.999f, 7.55f)
                curveTo(21.589f, 7.55f, 21.249f, 7.21f, 21.249f, 6.8f)
                verticalLineTo(2.75f)
                horizontalLineTo(17.199f)
                curveTo(16.789f, 2.75f, 16.449f, 2.41f, 16.449f, 2f)
                curveTo(16.449f, 1.59f, 16.789f, 1.25f, 17.199f, 1.25f)
                horizontalLineTo(21.999f)
                curveTo(22.409f, 1.25f, 22.749f, 1.59f, 22.749f, 2f)
                verticalLineTo(6.8f)
                curveTo(22.749f, 7.21f, 22.409f, 7.55f, 21.999f, 7.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(11f)
                curveTo(11.41f, 1.25f, 11.75f, 1.59f, 11.75f, 2f)
                curveTo(11.75f, 2.41f, 11.41f, 2.75f, 11f, 2.75f)
                horizontalLineTo(9f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(13f)
                curveTo(21.25f, 12.59f, 21.59f, 12.25f, 22f, 12.25f)
                curveTo(22.41f, 12.25f, 22.75f, 12.59f, 22.75f, 13f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
            }
        }.build()

        return _Export3!!
    }

@Suppress("ObjectPropertyName")
private var _Export3: ImageVector? = null
