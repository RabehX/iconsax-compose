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

val Iconsax.Outline.VolumeLow: ImageVector
    get() {
        if (_VolumeLow != null) {
            return _VolumeLow!!
        }
        _VolumeLow = ImageVector.Builder(
            name = "Outline.VolumeLow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.88f, 20.59f)
                curveTo(13.09f, 20.59f, 12.22f, 20.31f, 11.35f, 19.76f)
                lineTo(8.43f, 17.93f)
                curveTo(8.23f, 17.81f, 8f, 17.74f, 7.77f, 17.74f)
                horizontalLineTo(6.33f)
                curveTo(3.91f, 17.74f, 2.58f, 16.41f, 2.58f, 13.99f)
                verticalLineTo(9.99f)
                curveTo(2.58f, 7.57f, 3.91f, 6.24f, 6.33f, 6.24f)
                horizontalLineTo(7.76f)
                curveTo(7.99f, 6.24f, 8.22f, 6.17f, 8.42f, 6.05f)
                lineTo(11.34f, 4.22f)
                curveTo(12.8f, 3.31f, 14.22f, 3.14f, 15.34f, 3.76f)
                curveTo(16.46f, 4.38f, 17.07f, 5.67f, 17.07f, 7.4f)
                verticalLineTo(16.57f)
                curveTo(17.07f, 18.29f, 16.45f, 19.59f, 15.34f, 20.21f)
                curveTo(14.9f, 20.47f, 14.41f, 20.59f, 13.88f, 20.59f)
                close()
                moveTo(6.33f, 7.75f)
                curveTo(4.75f, 7.75f, 4.08f, 8.42f, 4.08f, 10f)
                verticalLineTo(14f)
                curveTo(4.08f, 15.58f, 4.75f, 16.25f, 6.33f, 16.25f)
                horizontalLineTo(7.76f)
                curveTo(8.28f, 16.25f, 8.78f, 16.39f, 9.22f, 16.67f)
                lineTo(12.14f, 18.5f)
                curveTo(13.11f, 19.1f, 14.01f, 19.26f, 14.62f, 18.92f)
                curveTo(15.23f, 18.58f, 15.58f, 17.73f, 15.58f, 16.6f)
                verticalLineTo(7.41f)
                curveTo(15.58f, 6.27f, 15.23f, 5.42f, 14.62f, 5.09f)
                curveTo(14.01f, 4.75f, 13.11f, 4.9f, 12.14f, 5.51f)
                lineTo(9.22f, 7.33f)
                curveTo(8.78f, 7.61f, 8.28f, 7.75f, 7.76f, 7.75f)
                horizontalLineTo(6.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.33f, 16.75f)
                curveTo(19.17f, 16.75f, 19.02f, 16.7f, 18.88f, 16.6f)
                curveTo(18.55f, 16.35f, 18.48f, 15.88f, 18.73f, 15.55f)
                curveTo(20.3f, 13.46f, 20.3f, 10.54f, 18.73f, 8.45f)
                curveTo(18.48f, 8.12f, 18.55f, 7.65f, 18.88f, 7.4f)
                curveTo(19.21f, 7.15f, 19.68f, 7.22f, 19.93f, 7.55f)
                curveTo(21.9f, 10.17f, 21.9f, 13.83f, 19.93f, 16.45f)
                curveTo(19.79f, 16.65f, 19.56f, 16.75f, 19.33f, 16.75f)
                close()
            }
        }.build()

        return _VolumeLow!!
    }

@Suppress("ObjectPropertyName")
private var _VolumeLow: ImageVector? = null
