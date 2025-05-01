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

val Iconsax.Outline.Warning2: ImageVector
    get() {
        if (_Warning2 != null) {
            return _Warning2!!
        }
        _Warning2 = ImageVector.Builder(
            name = "Outline.Warning2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 13.75f)
                curveTo(11.59f, 13.75f, 11.25f, 13.41f, 11.25f, 13f)
                verticalLineTo(7.75f)
                curveTo(11.25f, 7.34f, 11.59f, 7f, 12f, 7f)
                curveTo(12.41f, 7f, 12.75f, 7.34f, 12.75f, 7.75f)
                verticalLineTo(13f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 17.25f)
                curveTo(11.73f, 17.25f, 11.48f, 17.15f, 11.29f, 16.96f)
                curveTo(11.2f, 16.86f, 11.13f, 16.75f, 11.07f, 16.63f)
                curveTo(11.02f, 16.51f, 11f, 16.38f, 11f, 16.25f)
                curveTo(11f, 15.99f, 11.11f, 15.73f, 11.29f, 15.54f)
                curveTo(11.66f, 15.17f, 12.34f, 15.17f, 12.71f, 15.54f)
                curveTo(12.89f, 15.73f, 13f, 15.99f, 13f, 16.25f)
                curveTo(13f, 16.38f, 12.97f, 16.51f, 12.92f, 16.63f)
                curveTo(12.87f, 16.75f, 12.8f, 16.86f, 12.71f, 16.96f)
                curveTo(12.52f, 17.15f, 12.27f, 17.25f, 12f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(11.33f, 22.75f, 10.65f, 22.58f, 10.05f, 22.23f)
                lineTo(4.11f, 18.8f)
                curveTo(2.91f, 18.1f, 2.16f, 16.81f, 2.16f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(2.16f, 7.19f, 2.91f, 5.9f, 4.11f, 5.2f)
                lineTo(10.05f, 1.77f)
                curveTo(11.25f, 1.07f, 12.74f, 1.07f, 13.95f, 1.77f)
                lineTo(19.89f, 5.2f)
                curveTo(21.09f, 5.9f, 21.84f, 7.19f, 21.84f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(21.84f, 16.81f, 21.09f, 18.1f, 19.89f, 18.8f)
                lineTo(13.95f, 22.23f)
                curveTo(13.35f, 22.58f, 12.67f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(11.59f, 2.75f, 11.17f, 2.86f, 10.8f, 3.07f)
                lineTo(4.86f, 6.5f)
                curveTo(4.12f, 6.93f, 3.66f, 7.72f, 3.66f, 8.58f)
                verticalLineTo(15.42f)
                curveTo(3.66f, 16.27f, 4.12f, 17.07f, 4.86f, 17.5f)
                lineTo(10.8f, 20.93f)
                curveTo(11.54f, 21.36f, 12.46f, 21.36f, 13.19f, 20.93f)
                lineTo(19.13f, 17.5f)
                curveTo(19.87f, 17.07f, 20.33f, 16.28f, 20.33f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(20.33f, 7.73f, 19.87f, 6.93f, 19.13f, 6.5f)
                lineTo(13.19f, 3.07f)
                curveTo(12.83f, 2.86f, 12.41f, 2.75f, 12f, 2.75f)
                close()
            }
        }.build()

        return _Warning2!!
    }

@Suppress("ObjectPropertyName")
private var _Warning2: ImageVector? = null
