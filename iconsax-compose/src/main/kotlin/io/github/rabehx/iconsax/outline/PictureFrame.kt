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

val Iconsax.Outline.PictureFrame: ImageVector
    get() {
        if (_PictureFrame != null) {
            return _PictureFrame!!
        }
        _PictureFrame = ImageVector.Builder(
            name = "Outline.PictureFrame",
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
                moveTo(13.95f, 22.75f)
                curveTo(13.61f, 22.75f, 13.31f, 22.52f, 13.22f, 22.18f)
                lineTo(8.27f, 2.18f)
                curveTo(8.17f, 1.78f, 8.42f, 1.37f, 8.82f, 1.27f)
                curveTo(9.22f, 1.17f, 9.63f, 1.41f, 9.73f, 1.82f)
                lineTo(14.68f, 21.82f)
                curveTo(14.78f, 22.22f, 14.53f, 22.63f, 14.13f, 22.73f)
                curveTo(14.07f, 22.74f, 14.01f, 22.75f, 13.95f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 15.75f)
                curveTo(1.67f, 15.75f, 1.38f, 15.54f, 1.28f, 15.21f)
                curveTo(1.16f, 14.81f, 1.39f, 14.4f, 1.79f, 14.28f)
                lineTo(11.32f, 11.5f)
                curveTo(11.72f, 11.38f, 12.13f, 11.61f, 12.25f, 12.01f)
                curveTo(12.37f, 12.41f, 12.14f, 12.82f, 11.74f, 12.94f)
                lineTo(2.21f, 15.72f)
                curveTo(2.14f, 15.74f, 2.07f, 15.75f, 2f, 15.75f)
                close()
            }
        }.build()

        return _PictureFrame!!
    }

@Suppress("ObjectPropertyName")
private var _PictureFrame: ImageVector? = null
