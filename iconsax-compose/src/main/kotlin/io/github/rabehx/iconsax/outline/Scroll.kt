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

val Iconsax.Outline.Scroll: ImageVector
    get() {
        if (_Scroll != null) {
            return _Scroll!!
        }
        _Scroll = ImageVector.Builder(
            name = "Outline.Scroll",
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
                moveTo(9.599f, 15.78f)
                curveTo(9.409f, 15.78f, 9.219f, 15.71f, 9.069f, 15.56f)
                lineTo(6.579f, 13.07f)
                curveTo(5.989f, 12.48f, 5.989f, 11.53f, 6.579f, 10.94f)
                lineTo(9.069f, 8.45f)
                curveTo(9.359f, 8.16f, 9.839f, 8.16f, 10.129f, 8.45f)
                curveTo(10.419f, 8.74f, 10.419f, 9.22f, 10.129f, 9.51f)
                lineTo(7.639f, 12f)
                lineTo(10.129f, 14.5f)
                curveTo(10.419f, 14.79f, 10.419f, 15.27f, 10.129f, 15.56f)
                curveTo(9.979f, 15.7f, 9.789f, 15.78f, 9.599f, 15.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.4f, 15.78f)
                curveTo(14.21f, 15.78f, 14.02f, 15.71f, 13.87f, 15.56f)
                curveTo(13.58f, 15.27f, 13.58f, 14.79f, 13.87f, 14.5f)
                lineTo(16.36f, 12f)
                lineTo(13.87f, 9.5f)
                curveTo(13.58f, 9.21f, 13.58f, 8.73f, 13.87f, 8.44f)
                curveTo(14.16f, 8.15f, 14.64f, 8.15f, 14.93f, 8.44f)
                lineTo(17.42f, 10.93f)
                curveTo(18.01f, 11.52f, 18.01f, 12.47f, 17.42f, 13.06f)
                lineTo(14.93f, 15.55f)
                curveTo(14.79f, 15.7f, 14.59f, 15.78f, 14.4f, 15.78f)
                close()
            }
        }.build()

        return _Scroll!!
    }

@Suppress("ObjectPropertyName")
private var _Scroll: ImageVector? = null
