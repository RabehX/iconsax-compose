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

val Iconsax.Outline.DirectboxSend: ImageVector
    get() {
        if (_DirectboxSend != null) {
            return _DirectboxSend!!
        }
        _DirectboxSend = ImageVector.Builder(
            name = "Outline.DirectboxSend",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 8.75f)
                curveTo(11.59f, 8.75f, 11.25f, 8.41f, 11.25f, 8f)
                verticalLineTo(3.81f)
                lineTo(10.53f, 4.53f)
                curveTo(10.24f, 4.82f, 9.759f, 4.82f, 9.469f, 4.53f)
                curveTo(9.179f, 4.24f, 9.179f, 3.76f, 9.469f, 3.47f)
                lineTo(11.469f, 1.47f)
                curveTo(11.679f, 1.26f, 12.009f, 1.19f, 12.29f, 1.31f)
                curveTo(12.569f, 1.42f, 12.75f, 1.7f, 12.75f, 2f)
                verticalLineTo(8f)
                curveTo(12.75f, 8.41f, 12.41f, 8.75f, 12f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 4.75f)
                curveTo(13.809f, 4.75f, 13.62f, 4.68f, 13.469f, 4.53f)
                lineTo(11.469f, 2.53f)
                curveTo(11.179f, 2.24f, 11.179f, 1.76f, 11.469f, 1.47f)
                curveTo(11.759f, 1.18f, 12.24f, 1.18f, 12.53f, 1.47f)
                lineTo(14.53f, 3.47f)
                curveTo(14.819f, 3.76f, 14.819f, 4.24f, 14.53f, 4.53f)
                curveTo(14.38f, 4.68f, 14.189f, 4.75f, 14f, 4.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.75f)
                horizontalLineTo(8f)
                curveTo(2.25f, 22.75f, 2.25f, 19.7f, 2.25f, 17f)
                verticalLineTo(16f)
                curveTo(2.25f, 13.77f, 2.25f, 11.25f, 7f, 11.25f)
                curveTo(8.19f, 11.25f, 8.63f, 11.54f, 9.25f, 12f)
                curveTo(9.28f, 12.03f, 9.32f, 12.05f, 9.35f, 12.09f)
                lineTo(10.37f, 13.17f)
                curveTo(11.23f, 14.08f, 12.79f, 14.08f, 13.65f, 13.17f)
                lineTo(14.67f, 12.09f)
                curveTo(14.7f, 12.06f, 14.73f, 12.03f, 14.77f, 12f)
                curveTo(15.39f, 11.53f, 15.83f, 11.25f, 17.02f, 11.25f)
                curveTo(21.77f, 11.25f, 21.77f, 13.77f, 21.77f, 16f)
                verticalLineTo(17f)
                curveTo(21.75f, 20.82f, 19.82f, 22.75f, 16f, 22.75f)
                close()
                moveTo(7f, 12.75f)
                curveTo(3.75f, 12.75f, 3.75f, 13.77f, 3.75f, 16f)
                verticalLineTo(17f)
                curveTo(3.75f, 19.74f, 3.75f, 21.25f, 8f, 21.25f)
                horizontalLineTo(16f)
                curveTo(18.98f, 21.25f, 20.25f, 19.98f, 20.25f, 17f)
                verticalLineTo(16f)
                curveTo(20.25f, 13.77f, 20.25f, 12.75f, 17f, 12.75f)
                curveTo(16.28f, 12.75f, 16.13f, 12.84f, 15.7f, 13.16f)
                lineTo(14.73f, 14.19f)
                curveTo(14.01f, 14.95f, 13.04f, 15.37f, 12f, 15.37f)
                curveTo(10.96f, 15.37f, 9.99f, 14.95f, 9.27f, 14.19f)
                lineTo(8.3f, 13.16f)
                curveTo(7.87f, 12.84f, 7.72f, 12.75f, 7f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 12.75f)
                curveTo(4.59f, 12.75f, 4.25f, 12.41f, 4.25f, 12f)
                verticalLineTo(10f)
                curveTo(4.25f, 8.06f, 4.25f, 5.65f, 7.93f, 5.3f)
                curveTo(8.33f, 5.25f, 8.71f, 5.56f, 8.75f, 5.98f)
                curveTo(8.79f, 6.39f, 8.49f, 6.76f, 8.07f, 6.8f)
                curveTo(5.75f, 7.01f, 5.75f, 7.95f, 5.75f, 10f)
                verticalLineTo(12f)
                curveTo(5.75f, 12.41f, 5.41f, 12.75f, 5f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.999f, 12.75f)
                curveTo(18.589f, 12.75f, 18.249f, 12.41f, 18.249f, 12f)
                verticalLineTo(10f)
                curveTo(18.249f, 7.95f, 18.249f, 7.01f, 15.929f, 6.79f)
                curveTo(15.519f, 6.75f, 15.219f, 6.38f, 15.259f, 5.97f)
                curveTo(15.299f, 5.56f, 15.659f, 5.25f, 16.079f, 5.3f)
                curveTo(19.759f, 5.65f, 19.759f, 8.06f, 19.759f, 10f)
                verticalLineTo(12f)
                curveTo(19.749f, 12.41f, 19.409f, 12.75f, 18.999f, 12.75f)
                close()
            }
        }.build()

        return _DirectboxSend!!
    }

@Suppress("ObjectPropertyName")
private var _DirectboxSend: ImageVector? = null
