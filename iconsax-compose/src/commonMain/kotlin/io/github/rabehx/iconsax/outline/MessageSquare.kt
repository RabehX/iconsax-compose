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

val Iconsax.Outline.MessageSquare: ImageVector
    get() {
        if (_MessageSquare != null) {
            return _MessageSquare!!
        }
        _MessageSquare = ImageVector.Builder(
            name = "Outline.MessageSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 19.35f)
                curveTo(11.479f, 19.35f, 10.989f, 19.09f, 10.639f, 18.63f)
                lineTo(9.729f, 17.42f)
                horizontalLineTo(9.479f)
                curveTo(6.769f, 17.42f, 4.969f, 16.65f, 4.969f, 12.91f)
                verticalLineTo(9.77f)
                curveTo(4.969f, 7.09f, 6.339f, 5.5f, 8.829f, 5.29f)
                curveTo(9.019f, 5.27f, 9.249f, 5.26f, 9.479f, 5.26f)
                horizontalLineTo(14.509f)
                curveTo(17.419f, 5.26f, 19.019f, 6.86f, 19.019f, 9.77f)
                verticalLineTo(12.91f)
                curveTo(19.019f, 13.15f, 19.009f, 13.37f, 18.979f, 13.59f)
                curveTo(18.769f, 16.05f, 17.179f, 17.42f, 14.499f, 17.42f)
                horizontalLineTo(14.249f)
                lineTo(13.339f, 18.63f)
                curveTo(13.009f, 19.09f, 12.519f, 19.35f, 11.999f, 19.35f)
                close()
                moveTo(9.489f, 6.75f)
                curveTo(9.319f, 6.75f, 9.149f, 6.76f, 8.989f, 6.78f)
                curveTo(7.239f, 6.93f, 6.469f, 7.85f, 6.469f, 9.77f)
                verticalLineTo(12.91f)
                curveTo(6.469f, 15.49f, 7.219f, 15.92f, 9.479f, 15.92f)
                horizontalLineTo(9.789f)
                curveTo(10.189f, 15.92f, 10.639f, 16.14f, 10.889f, 16.46f)
                lineTo(11.839f, 17.73f)
                curveTo(11.899f, 17.81f, 11.959f, 17.85f, 11.989f, 17.85f)
                curveTo(12.019f, 17.85f, 12.079f, 17.81f, 12.139f, 17.73f)
                lineTo(13.079f, 16.47f)
                curveTo(13.339f, 16.12f, 13.749f, 15.92f, 14.179f, 15.92f)
                horizontalLineTo(14.489f)
                curveTo(16.409f, 15.92f, 17.329f, 15.15f, 17.479f, 13.43f)
                curveTo(17.499f, 13.24f, 17.509f, 13.08f, 17.509f, 12.9f)
                verticalLineTo(9.76f)
                curveTo(17.509f, 7.68f, 16.579f, 6.75f, 14.499f, 6.75f)
                horizontalLineTo(9.489f)
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

        return _MessageSquare!!
    }

@Suppress("ObjectPropertyName")
private var _MessageSquare: ImageVector? = null
