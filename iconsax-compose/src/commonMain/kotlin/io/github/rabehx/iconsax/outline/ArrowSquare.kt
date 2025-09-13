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

val Iconsax.Outline.ArrowSquare: ImageVector
    get() {
        if (_ArrowSquare != null) {
            return _ArrowSquare!!
        }
        _ArrowSquare = ImageVector.Builder(
            name = "Outline.ArrowSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.141f, 15.82f)
                curveTo(11.731f, 15.82f, 11.391f, 15.48f, 11.391f, 15.07f)
                verticalLineTo(13.11f)
                curveTo(11.391f, 10.18f, 13.771f, 7.8f, 16.711f, 7.8f)
                horizontalLineTo(18.671f)
                curveTo(19.081f, 7.8f, 19.421f, 8.14f, 19.421f, 8.55f)
                curveTo(19.421f, 8.96f, 19.081f, 9.3f, 18.671f, 9.3f)
                horizontalLineTo(16.711f)
                curveTo(14.611f, 9.3f, 12.891f, 11.01f, 12.891f, 13.11f)
                verticalLineTo(15.07f)
                curveTo(12.891f, 15.49f, 12.551f, 15.82f, 12.141f, 15.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.141f, 18f)
                curveTo(11.731f, 18f, 11.391f, 17.66f, 11.391f, 17.25f)
                verticalLineTo(13.12f)
                curveTo(11.391f, 11.02f, 9.681f, 9.31f, 7.581f, 9.31f)
                horizontalLineTo(5.621f)
                curveTo(5.211f, 9.31f, 4.871f, 8.97f, 4.871f, 8.56f)
                curveTo(4.871f, 8.15f, 5.211f, 7.81f, 5.621f, 7.81f)
                horizontalLineTo(7.581f)
                curveTo(10.511f, 7.81f, 12.891f, 10.19f, 12.891f, 13.12f)
                verticalLineTo(17.25f)
                curveTo(12.891f, 17.66f, 12.551f, 18f, 12.141f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.139f, 11.1f)
                curveTo(6.949f, 11.1f, 6.759f, 11.03f, 6.609f, 10.88f)
                lineTo(4.809f, 9.08f)
                curveTo(4.519f, 8.79f, 4.519f, 8.31f, 4.809f, 8.02f)
                lineTo(6.609f, 6.22f)
                curveTo(6.899f, 5.93f, 7.379f, 5.93f, 7.669f, 6.22f)
                curveTo(7.959f, 6.51f, 7.959f, 6.99f, 7.669f, 7.28f)
                lineTo(6.399f, 8.55f)
                lineTo(7.669f, 9.82f)
                curveTo(7.959f, 10.11f, 7.959f, 10.59f, 7.669f, 10.88f)
                curveTo(7.519f, 11.03f, 7.329f, 11.1f, 7.139f, 11.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.861f, 11.1f)
                curveTo(16.671f, 11.1f, 16.481f, 11.03f, 16.331f, 10.88f)
                curveTo(16.041f, 10.59f, 16.041f, 10.11f, 16.331f, 9.82f)
                lineTo(17.601f, 8.55f)
                lineTo(16.331f, 7.28f)
                curveTo(16.041f, 6.99f, 16.041f, 6.51f, 16.331f, 6.22f)
                curveTo(16.621f, 5.93f, 17.101f, 5.93f, 17.391f, 6.22f)
                lineTo(19.191f, 8.02f)
                curveTo(19.481f, 8.31f, 19.481f, 8.79f, 19.191f, 9.08f)
                lineTo(17.391f, 10.88f)
                curveTo(17.251f, 11.03f, 17.051f, 11.1f, 16.861f, 11.1f)
                close()
            }
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
        }.build()

        return _ArrowSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSquare: ImageVector? = null
