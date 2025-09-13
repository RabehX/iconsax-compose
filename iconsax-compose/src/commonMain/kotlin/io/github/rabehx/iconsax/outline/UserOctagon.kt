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

val Iconsax.Outline.UserOctagon: ImageVector
    get() {
        if (_UserOctagon != null) {
            return _UserOctagon!!
        }
        _UserOctagon = ImageVector.Builder(
            name = "Outline.UserOctagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                curveTo(11.54f, 21.36f, 12.46f, 21.36f, 13.2f, 20.93f)
                lineTo(19.14f, 17.5f)
                curveTo(19.88f, 17.07f, 20.34f, 16.28f, 20.34f, 15.42f)
                verticalLineTo(8.58f)
                curveTo(20.34f, 7.73f, 19.88f, 6.93f, 19.14f, 6.5f)
                lineTo(13.2f, 3.07f)
                curveTo(12.83f, 2.86f, 12.41f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 11.75f)
                curveTo(10.3f, 11.75f, 8.92f, 10.37f, 8.92f, 8.67f)
                curveTo(8.92f, 6.97f, 10.3f, 5.59f, 12f, 5.59f)
                curveTo(13.7f, 5.59f, 15.08f, 6.97f, 15.08f, 8.67f)
                curveTo(15.08f, 10.37f, 13.7f, 11.75f, 12f, 11.75f)
                close()
                moveTo(12f, 7.09f)
                curveTo(11.13f, 7.09f, 10.42f, 7.8f, 10.42f, 8.67f)
                curveTo(10.42f, 9.54f, 11.13f, 10.25f, 12f, 10.25f)
                curveTo(12.87f, 10.25f, 13.58f, 9.54f, 13.58f, 8.67f)
                curveTo(13.58f, 7.8f, 12.87f, 7.09f, 12f, 7.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 17.41f)
                curveTo(15.59f, 17.41f, 15.25f, 17.07f, 15.25f, 16.66f)
                curveTo(15.25f, 15.28f, 13.79f, 14.15f, 12f, 14.15f)
                curveTo(10.21f, 14.15f, 8.75f, 15.28f, 8.75f, 16.66f)
                curveTo(8.75f, 17.07f, 8.41f, 17.41f, 8f, 17.41f)
                curveTo(7.59f, 17.41f, 7.25f, 17.07f, 7.25f, 16.66f)
                curveTo(7.25f, 14.45f, 9.38f, 12.65f, 12f, 12.65f)
                curveTo(14.62f, 12.65f, 16.75f, 14.45f, 16.75f, 16.66f)
                curveTo(16.75f, 17.07f, 16.41f, 17.41f, 16f, 17.41f)
                close()
            }
        }.build()

        return _UserOctagon!!
    }

@Suppress("ObjectPropertyName")
private var _UserOctagon: ImageVector? = null
