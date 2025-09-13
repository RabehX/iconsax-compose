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

val Iconsax.Outline.ForwardSquare: ImageVector
    get() {
        if (_ForwardSquare != null) {
            return _ForwardSquare!!
        }
        _ForwardSquare = ImageVector.Builder(
            name = "Outline.ForwardSquare",
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
                moveTo(15f, 16.13f)
                horizontalLineTo(10.08f)
                curveTo(7.97f, 16.13f, 6.25f, 14.41f, 6.25f, 12.3f)
                curveTo(6.25f, 10.19f, 7.97f, 8.47f, 10.08f, 8.47f)
                horizontalLineTo(16.85f)
                curveTo(17.26f, 8.47f, 17.6f, 8.81f, 17.6f, 9.22f)
                curveTo(17.6f, 9.63f, 17.26f, 9.97f, 16.85f, 9.97f)
                horizontalLineTo(10.08f)
                curveTo(8.8f, 9.97f, 7.75f, 11.01f, 7.75f, 12.3f)
                curveTo(7.75f, 13.59f, 8.79f, 14.63f, 10.08f, 14.63f)
                horizontalLineTo(15f)
                curveTo(15.41f, 14.63f, 15.75f, 14.97f, 15.75f, 15.38f)
                curveTo(15.75f, 15.79f, 15.41f, 16.13f, 15f, 16.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.431f, 11.52f)
                curveTo(15.241f, 11.52f, 15.051f, 11.45f, 14.901f, 11.3f)
                curveTo(14.611f, 11.01f, 14.611f, 10.53f, 14.901f, 10.24f)
                lineTo(15.941f, 9.2f)
                lineTo(14.901f, 8.16f)
                curveTo(14.611f, 7.87f, 14.611f, 7.39f, 14.901f, 7.1f)
                curveTo(15.191f, 6.81f, 15.671f, 6.81f, 15.961f, 7.1f)
                lineTo(17.531f, 8.67f)
                curveTo(17.821f, 8.96f, 17.821f, 9.44f, 17.531f, 9.73f)
                lineTo(15.961f, 11.3f)
                curveTo(15.811f, 11.44f, 15.621f, 11.52f, 15.431f, 11.52f)
                close()
            }
        }.build()

        return _ForwardSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ForwardSquare: ImageVector? = null
