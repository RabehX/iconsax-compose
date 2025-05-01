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

val Iconsax.Outline.HeartSearch: ImageVector
    get() {
        if (_HeartSearch != null) {
            return _HeartSearch!!
        }
        _HeartSearch = ImageVector.Builder(
            name = "Outline.HeartSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.65f)
                curveTo(11.78f, 21.65f, 11.45f, 21.63f, 11.14f, 21.52f)
                curveTo(7.32f, 20.21f, 1.25f, 15.57f, 1.25f, 8.69f)
                curveTo(1.25f, 5.19f, 4.08f, 2.35f, 7.56f, 2.35f)
                curveTo(9.25f, 2.35f, 10.83f, 3.01f, 12f, 4.19f)
                curveTo(13.17f, 3.01f, 14.75f, 2.35f, 16.44f, 2.35f)
                curveTo(19.92f, 2.35f, 22.75f, 5.19f, 22.75f, 8.69f)
                curveTo(22.75f, 9.9f, 22.57f, 11.09f, 22.21f, 12.23f)
                curveTo(22.09f, 12.62f, 21.66f, 12.85f, 21.27f, 12.72f)
                curveTo(20.87f, 12.6f, 20.66f, 12.17f, 20.78f, 11.78f)
                curveTo(21.09f, 10.79f, 21.25f, 9.75f, 21.25f, 8.7f)
                curveTo(21.25f, 6.03f, 19.09f, 3.86f, 16.44f, 3.86f)
                curveTo(14.92f, 3.86f, 13.51f, 4.57f, 12.6f, 5.79f)
                curveTo(12.32f, 6.17f, 11.68f, 6.17f, 11.4f, 5.79f)
                curveTo(10.48f, 4.56f, 9.08f, 3.86f, 7.56f, 3.86f)
                curveTo(4.91f, 3.86f, 2.75f, 6.03f, 2.75f, 8.7f)
                curveTo(2.75f, 15.54f, 9.32f, 19.33f, 11.63f, 20.12f)
                curveTo(11.69f, 20.14f, 11.83f, 20.17f, 12f, 20.17f)
                curveTo(12.41f, 20.17f, 12.75f, 20.51f, 12.75f, 20.92f)
                curveTo(12.75f, 21.33f, 12.41f, 21.65f, 12f, 21.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.739f, 21.75f)
                curveTo(15.559f, 21.75f, 13.789f, 19.98f, 13.789f, 17.8f)
                curveTo(13.789f, 15.62f, 15.559f, 13.85f, 17.739f, 13.85f)
                curveTo(19.919f, 13.85f, 21.689f, 15.62f, 21.689f, 17.8f)
                curveTo(21.689f, 19.98f, 19.919f, 21.75f, 17.739f, 21.75f)
                close()
                moveTo(17.739f, 15.35f)
                curveTo(16.389f, 15.35f, 15.289f, 16.45f, 15.289f, 17.8f)
                curveTo(15.289f, 19.15f, 16.389f, 20.25f, 17.739f, 20.25f)
                curveTo(19.089f, 20.25f, 20.189f, 19.15f, 20.189f, 17.8f)
                curveTo(20.189f, 16.45f, 19.089f, 15.35f, 17.739f, 15.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.541f, 22.35f)
                curveTo(21.351f, 22.35f, 21.16f, 22.28f, 21.01f, 22.13f)
                lineTo(20.01f, 21.13f)
                curveTo(19.721f, 20.84f, 19.721f, 20.36f, 20.01f, 20.07f)
                curveTo(20.301f, 19.78f, 20.781f, 19.78f, 21.07f, 20.07f)
                lineTo(22.07f, 21.07f)
                curveTo(22.361f, 21.36f, 22.361f, 21.84f, 22.07f, 22.13f)
                curveTo(21.92f, 22.27f, 21.73f, 22.35f, 21.541f, 22.35f)
                close()
            }
        }.build()

        return _HeartSearch!!
    }

@Suppress("ObjectPropertyName")
private var _HeartSearch: ImageVector? = null
