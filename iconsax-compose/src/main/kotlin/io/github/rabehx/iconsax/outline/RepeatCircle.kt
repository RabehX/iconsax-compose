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

val Iconsax.Outline.RepeatCircle: ImageVector
    get() {
        if (_RepeatCircle != null) {
            return _RepeatCircle!!
        }
        _RepeatCircle = ImageVector.Builder(
            name = "Outline.RepeatCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 12.47f)
                curveTo(16.09f, 12.47f, 15.75f, 12.13f, 15.75f, 11.72f)
                verticalLineTo(9.95f)
                curveTo(15.75f, 9.48f, 15.37f, 9.1f, 14.9f, 9.1f)
                horizontalLineTo(7.5f)
                curveTo(7.09f, 9.1f, 6.75f, 8.76f, 6.75f, 8.35f)
                curveTo(6.75f, 7.94f, 7.09f, 7.6f, 7.5f, 7.6f)
                horizontalLineTo(14.9f)
                curveTo(16.2f, 7.6f, 17.25f, 8.66f, 17.25f, 9.95f)
                verticalLineTo(11.72f)
                curveTo(17.25f, 12.13f, 16.91f, 12.47f, 16.5f, 12.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.189f, 10.78f)
                curveTo(8.999f, 10.78f, 8.809f, 10.71f, 8.659f, 10.56f)
                lineTo(6.969f, 8.87f)
                curveTo(6.679f, 8.58f, 6.679f, 8.1f, 6.969f, 7.81f)
                lineTo(8.659f, 6.12f)
                curveTo(8.949f, 5.83f, 9.429f, 5.83f, 9.719f, 6.12f)
                curveTo(10.009f, 6.41f, 10.009f, 6.89f, 9.719f, 7.18f)
                lineTo(8.559f, 8.34f)
                lineTo(9.719f, 9.5f)
                curveTo(10.009f, 9.79f, 10.009f, 10.27f, 9.719f, 10.56f)
                curveTo(9.569f, 10.71f, 9.379f, 10.78f, 9.189f, 10.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 16.41f)
                horizontalLineTo(9.1f)
                curveTo(7.8f, 16.41f, 6.75f, 15.35f, 6.75f, 14.06f)
                verticalLineTo(12.29f)
                curveTo(6.75f, 11.88f, 7.09f, 11.54f, 7.5f, 11.54f)
                curveTo(7.91f, 11.54f, 8.25f, 11.88f, 8.25f, 12.29f)
                verticalLineTo(14.06f)
                curveTo(8.25f, 14.53f, 8.63f, 14.91f, 9.1f, 14.91f)
                horizontalLineTo(16.5f)
                curveTo(16.91f, 14.91f, 17.25f, 15.25f, 17.25f, 15.66f)
                curveTo(17.25f, 16.07f, 16.91f, 16.41f, 16.5f, 16.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.81f, 18.09f)
                curveTo(14.62f, 18.09f, 14.43f, 18.02f, 14.28f, 17.87f)
                curveTo(13.99f, 17.58f, 13.99f, 17.1f, 14.28f, 16.81f)
                lineTo(15.44f, 15.65f)
                lineTo(14.28f, 14.49f)
                curveTo(13.99f, 14.2f, 13.99f, 13.72f, 14.28f, 13.43f)
                curveTo(14.57f, 13.14f, 15.05f, 13.14f, 15.34f, 13.43f)
                lineTo(17.03f, 15.12f)
                curveTo(17.32f, 15.41f, 17.32f, 15.89f, 17.03f, 16.18f)
                lineTo(15.34f, 17.87f)
                curveTo(15.2f, 18.02f, 15f, 18.09f, 14.81f, 18.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
        }.build()

        return _RepeatCircle!!
    }

@Suppress("ObjectPropertyName")
private var _RepeatCircle: ImageVector? = null
