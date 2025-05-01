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

val Iconsax.Outline.BagTimer: ImageVector
    get() {
        if (_BagTimer != null) {
            return _BagTimer!!
        }
        _BagTimer = ImageVector.Builder(
            name = "Outline.BagTimer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.75f)
                curveTo(9.38f, 19.75f, 7.25f, 17.62f, 7.25f, 15f)
                curveTo(7.25f, 12.38f, 9.38f, 10.25f, 12f, 10.25f)
                curveTo(14.62f, 10.25f, 16.75f, 12.38f, 16.75f, 15f)
                curveTo(16.75f, 17.62f, 14.62f, 19.75f, 12f, 19.75f)
                close()
                moveTo(12f, 11.75f)
                curveTo(10.21f, 11.75f, 8.75f, 13.21f, 8.75f, 15f)
                curveTo(8.75f, 16.79f, 10.21f, 18.25f, 12f, 18.25f)
                curveTo(13.79f, 18.25f, 15.25f, 16.79f, 15.25f, 15f)
                curveTo(15.25f, 13.21f, 13.79f, 11.75f, 12f, 11.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 16.75f)
                curveTo(10.75f, 16.75f, 10.5f, 16.62f, 10.36f, 16.39f)
                curveTo(10.15f, 16.03f, 10.26f, 15.57f, 10.62f, 15.36f)
                lineTo(11.38f, 14.9f)
                curveTo(11.46f, 14.85f, 11.5f, 14.77f, 11.5f, 14.69f)
                verticalLineTo(13.76f)
                curveTo(11.5f, 13.35f, 11.84f, 13.01f, 12.25f, 13.01f)
                curveTo(12.66f, 13.01f, 13f, 13.34f, 13f, 13.75f)
                verticalLineTo(14.68f)
                curveTo(13f, 15.29f, 12.67f, 15.87f, 12.15f, 16.18f)
                lineTo(11.38f, 16.64f)
                curveTo(11.27f, 16.72f, 11.13f, 16.75f, 11f, 16.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(4.38f, 22.75f, 3.52f, 20.6f, 3.3f, 18.51f)
                lineTo(2.55f, 12.52f)
                curveTo(2.44f, 11.44f, 2.4f, 9.89f, 3.45f, 8.73f)
                curveTo(4.35f, 7.73f, 5.84f, 7.25f, 8f, 7.25f)
                horizontalLineTo(16f)
                curveTo(18.17f, 7.25f, 19.66f, 7.74f, 20.55f, 8.73f)
                curveTo(21.59f, 9.89f, 21.56f, 11.44f, 21.45f, 12.5f)
                lineTo(20.7f, 18.51f)
                curveTo(20.48f, 20.6f, 19.62f, 22.75f, 15f, 22.75f)
                close()
                moveTo(8f, 8.75f)
                curveTo(6.31f, 8.75f, 5.15f, 9.08f, 4.56f, 9.74f)
                curveTo(4.07f, 10.28f, 3.91f, 11.11f, 4.04f, 12.35f)
                lineTo(4.79f, 18.34f)
                curveTo(4.96f, 19.94f, 5.4f, 21.26f, 9f, 21.26f)
                horizontalLineTo(15f)
                curveTo(18.6f, 21.26f, 19.04f, 19.95f, 19.21f, 18.36f)
                lineTo(19.96f, 12.35f)
                curveTo(20.09f, 11.13f, 19.93f, 10.3f, 19.44f, 9.75f)
                curveTo(18.85f, 9.08f, 17.69f, 8.75f, 16f, 8.75f)
                horizontalLineTo(8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 8.63f)
                curveTo(16.09f, 8.63f, 15.75f, 8.29f, 15.75f, 7.88f)
                verticalLineTo(6.5f)
                curveTo(15.75f, 5.45f, 15.3f, 4.43f, 14.52f, 3.72f)
                curveTo(13.73f, 3f, 12.7f, 2.67f, 11.63f, 2.77f)
                curveTo(9.83f, 2.94f, 8.25f, 4.78f, 8.25f, 6.7f)
                verticalLineTo(7.67f)
                curveTo(8.25f, 8.08f, 7.91f, 8.42f, 7.5f, 8.42f)
                curveTo(7.09f, 8.42f, 6.75f, 8.08f, 6.75f, 7.67f)
                verticalLineTo(6.69f)
                curveTo(6.75f, 4f, 8.92f, 1.52f, 11.49f, 1.27f)
                curveTo(12.99f, 1.13f, 14.43f, 1.6f, 15.53f, 2.61f)
                curveTo(16.62f, 3.6f, 17.25f, 5.02f, 17.25f, 6.5f)
                verticalLineTo(7.88f)
                curveTo(17.25f, 8.29f, 16.91f, 8.63f, 16.5f, 8.63f)
                close()
            }
        }.build()

        return _BagTimer!!
    }

@Suppress("ObjectPropertyName")
private var _BagTimer: ImageVector? = null
