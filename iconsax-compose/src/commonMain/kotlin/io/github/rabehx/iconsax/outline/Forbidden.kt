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

val Iconsax.Outline.Forbidden: ImageVector
    get() {
        if (_Forbidden != null) {
            return _Forbidden!!
        }
        _Forbidden = ImageVector.Builder(
            name = "Outline.Forbidden",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.9f, 22.75f)
                horizontalLineTo(9.1f)
                curveTo(8.21f, 22.75f, 7.07f, 22.28f, 6.45f, 21.65f)
                lineTo(2.35f, 17.55f)
                curveTo(1.72f, 16.92f, 1.25f, 15.78f, 1.25f, 14.9f)
                verticalLineTo(9.1f)
                curveTo(1.25f, 8.21f, 1.72f, 7.07f, 2.35f, 6.45f)
                lineTo(6.45f, 2.35f)
                curveTo(7.08f, 1.72f, 8.22f, 1.25f, 9.1f, 1.25f)
                horizontalLineTo(14.9f)
                curveTo(15.79f, 1.25f, 16.93f, 1.72f, 17.55f, 2.35f)
                lineTo(21.65f, 6.45f)
                curveTo(22.28f, 7.08f, 22.75f, 8.22f, 22.75f, 9.1f)
                verticalLineTo(14.9f)
                curveTo(22.75f, 15.79f, 22.28f, 16.93f, 21.65f, 17.55f)
                lineTo(17.55f, 21.65f)
                curveTo(16.92f, 22.28f, 15.79f, 22.75f, 14.9f, 22.75f)
                close()
                moveTo(9.1f, 2.75f)
                curveTo(8.61f, 2.75f, 7.85f, 3.06f, 7.51f, 3.41f)
                lineTo(3.41f, 7.51f)
                curveTo(3.07f, 7.86f, 2.75f, 8.61f, 2.75f, 9.1f)
                verticalLineTo(14.9f)
                curveTo(2.75f, 15.39f, 3.06f, 16.15f, 3.41f, 16.49f)
                lineTo(7.51f, 20.59f)
                curveTo(7.86f, 20.93f, 8.61f, 21.25f, 9.1f, 21.25f)
                horizontalLineTo(14.9f)
                curveTo(15.39f, 21.25f, 16.15f, 20.94f, 16.49f, 20.59f)
                lineTo(20.59f, 16.49f)
                curveTo(20.93f, 16.14f, 21.25f, 15.39f, 21.25f, 14.9f)
                verticalLineTo(9.1f)
                curveTo(21.25f, 8.61f, 20.94f, 7.85f, 20.59f, 7.51f)
                lineTo(16.49f, 3.41f)
                curveTo(16.14f, 3.07f, 15.39f, 2.75f, 14.9f, 2.75f)
                horizontalLineTo(9.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.939f, 19.83f)
                curveTo(4.749f, 19.83f, 4.559f, 19.76f, 4.409f, 19.61f)
                curveTo(4.119f, 19.32f, 4.119f, 18.84f, 4.409f, 18.55f)
                lineTo(18.549f, 4.41f)
                curveTo(18.839f, 4.12f, 19.319f, 4.12f, 19.609f, 4.41f)
                curveTo(19.899f, 4.7f, 19.899f, 5.18f, 19.609f, 5.47f)
                lineTo(5.469f, 19.61f)
                curveTo(5.319f, 19.76f, 5.129f, 19.83f, 4.939f, 19.83f)
                close()
            }
        }.build()

        return _Forbidden!!
    }

@Suppress("ObjectPropertyName")
private var _Forbidden: ImageVector? = null
