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

val Iconsax.Outline.Microphone: ImageVector
    get() {
        if (_Microphone != null) {
            return _Microphone!!
        }
        _Microphone = ImageVector.Builder(
            name = "Outline.Microphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.75f)
                curveTo(8.28f, 19.75f, 5.25f, 16.72f, 5.25f, 13f)
                verticalLineTo(8f)
                curveTo(5.25f, 4.28f, 8.28f, 1.25f, 12f, 1.25f)
                curveTo(15.72f, 1.25f, 18.75f, 4.28f, 18.75f, 8f)
                verticalLineTo(13f)
                curveTo(18.75f, 16.72f, 15.72f, 19.75f, 12f, 19.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(9.11f, 2.75f, 6.75f, 5.1f, 6.75f, 8f)
                verticalLineTo(13f)
                curveTo(6.75f, 15.9f, 9.11f, 18.25f, 12f, 18.25f)
                curveTo(14.89f, 18.25f, 17.25f, 15.9f, 17.25f, 13f)
                verticalLineTo(8f)
                curveTo(17.25f, 5.1f, 14.89f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.62f, 22.75f, 2.25f, 18.38f, 2.25f, 13f)
                verticalLineTo(11f)
                curveTo(2.25f, 10.59f, 2.59f, 10.25f, 3f, 10.25f)
                curveTo(3.41f, 10.25f, 3.75f, 10.59f, 3.75f, 11f)
                verticalLineTo(13f)
                curveTo(3.75f, 17.55f, 7.45f, 21.25f, 12f, 21.25f)
                curveTo(16.55f, 21.25f, 20.25f, 17.55f, 20.25f, 13f)
                verticalLineTo(11f)
                curveTo(20.25f, 10.59f, 20.59f, 10.25f, 21f, 10.25f)
                curveTo(21.41f, 10.25f, 21.75f, 10.59f, 21.75f, 11f)
                verticalLineTo(13f)
                curveTo(21.75f, 18.38f, 17.38f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.61f, 8.23f)
                curveTo(14.53f, 8.23f, 14.44f, 8.22f, 14.35f, 8.19f)
                curveTo(12.74f, 7.61f, 10.97f, 7.61f, 9.36f, 8.19f)
                curveTo(8.98f, 8.33f, 8.55f, 8.13f, 8.41f, 7.74f)
                curveTo(8.27f, 7.35f, 8.47f, 6.92f, 8.86f, 6.78f)
                curveTo(10.8f, 6.08f, 12.93f, 6.08f, 14.87f, 6.78f)
                curveTo(15.26f, 6.92f, 15.46f, 7.35f, 15.32f, 7.74f)
                curveTo(15.21f, 8.05f, 14.92f, 8.23f, 14.61f, 8.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.7f, 11.23f)
                curveTo(13.64f, 11.23f, 13.57f, 11.22f, 13.5f, 11.2f)
                curveTo(12.43f, 10.91f, 11.3f, 10.91f, 10.23f, 11.2f)
                curveTo(9.82f, 11.31f, 9.42f, 11.07f, 9.31f, 10.67f)
                curveTo(9.2f, 10.27f, 9.44f, 9.86f, 9.84f, 9.75f)
                curveTo(11.17f, 9.39f, 12.57f, 9.39f, 13.9f, 9.75f)
                curveTo(14.3f, 9.86f, 14.54f, 10.27f, 14.43f, 10.67f)
                curveTo(14.33f, 11.02f, 14.03f, 11.23f, 13.7f, 11.23f)
                close()
            }
        }.build()

        return _Microphone!!
    }

@Suppress("ObjectPropertyName")
private var _Microphone: ImageVector? = null
