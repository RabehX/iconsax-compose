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

val Iconsax.Outline.VolumeMute: ImageVector
    get() {
        if (_VolumeMute != null) {
            return _VolumeMute!!
        }
        _VolumeMute = ImageVector.Builder(
            name = "Outline.VolumeMute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.05f, 20.59f)
                curveTo(15.26f, 20.59f, 14.39f, 20.31f, 13.52f, 19.76f)
                lineTo(10.6f, 17.93f)
                curveTo(10.4f, 17.81f, 10.17f, 17.74f, 9.94f, 17.74f)
                horizontalLineTo(8.5f)
                curveTo(6.08f, 17.74f, 4.75f, 16.41f, 4.75f, 13.99f)
                verticalLineTo(9.99f)
                curveTo(4.75f, 7.57f, 6.08f, 6.24f, 8.5f, 6.24f)
                horizontalLineTo(9.93f)
                curveTo(10.16f, 6.24f, 10.39f, 6.17f, 10.59f, 6.05f)
                lineTo(13.51f, 4.22f)
                curveTo(14.97f, 3.31f, 16.39f, 3.14f, 17.51f, 3.76f)
                curveTo(18.63f, 4.38f, 19.24f, 5.67f, 19.24f, 7.4f)
                verticalLineTo(16.57f)
                curveTo(19.24f, 18.29f, 18.62f, 19.59f, 17.51f, 20.21f)
                curveTo(17.07f, 20.47f, 16.57f, 20.59f, 16.05f, 20.59f)
                close()
                moveTo(8.5f, 7.75f)
                curveTo(6.92f, 7.75f, 6.25f, 8.42f, 6.25f, 10f)
                verticalLineTo(14f)
                curveTo(6.25f, 15.58f, 6.92f, 16.25f, 8.5f, 16.25f)
                horizontalLineTo(9.93f)
                curveTo(10.45f, 16.25f, 10.95f, 16.39f, 11.39f, 16.67f)
                lineTo(14.31f, 18.5f)
                curveTo(15.28f, 19.1f, 16.18f, 19.26f, 16.79f, 18.92f)
                curveTo(17.4f, 18.58f, 17.75f, 17.73f, 17.75f, 16.6f)
                verticalLineTo(7.41f)
                curveTo(17.75f, 6.27f, 17.4f, 5.42f, 16.79f, 5.09f)
                curveTo(16.18f, 4.75f, 15.28f, 4.9f, 14.31f, 5.51f)
                lineTo(11.39f, 7.34f)
                curveTo(10.95f, 7.61f, 10.45f, 7.76f, 9.93f, 7.76f)
                horizontalLineTo(8.5f)
                verticalLineTo(7.75f)
                close()
            }
        }.build()

        return _VolumeMute!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeMute: ImageVector? = null
