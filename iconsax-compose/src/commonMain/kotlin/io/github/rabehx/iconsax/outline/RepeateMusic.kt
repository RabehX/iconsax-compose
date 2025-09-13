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

val Iconsax.Outline.RepeateMusic: ImageVector
    get() {
        if (_RepeateMusic != null) {
            return _RepeateMusic!!
        }
        _RepeateMusic = ImageVector.Builder(
            name = "Outline.RepeateMusic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.91f, 17.18f)
                curveTo(3.72f, 17.18f, 3.53f, 17.11f, 3.38f, 16.96f)
                curveTo(2.01f, 15.58f, 1.25f, 13.76f, 1.25f, 11.83f)
                curveTo(1.25f, 7.82f, 4.5f, 4.56f, 8.5f, 4.56f)
                lineTo(14.57f, 4.58f)
                lineTo(13.48f, 3.54f)
                curveTo(13.18f, 3.25f, 13.17f, 2.78f, 13.46f, 2.48f)
                curveTo(13.75f, 2.18f, 14.22f, 2.17f, 14.52f, 2.46f)
                lineTo(16.96f, 4.8f)
                curveTo(17.18f, 5.01f, 17.25f, 5.34f, 17.14f, 5.62f)
                curveTo(17.03f, 5.9f, 16.75f, 6.09f, 16.44f, 6.09f)
                lineTo(8.49f, 6.07f)
                curveTo(5.32f, 6.07f, 2.74f, 8.66f, 2.74f, 11.84f)
                curveTo(2.74f, 13.37f, 3.34f, 14.82f, 4.43f, 15.91f)
                curveTo(4.72f, 16.2f, 4.72f, 16.68f, 4.43f, 16.97f)
                curveTo(4.29f, 17.11f, 4.1f, 17.18f, 3.91f, 17.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 21.75f)
                curveTo(9.81f, 21.75f, 9.63f, 21.68f, 9.48f, 21.54f)
                lineTo(7.04f, 19.2f)
                curveTo(6.82f, 18.99f, 6.75f, 18.66f, 6.86f, 18.38f)
                curveTo(6.97f, 18.1f, 7.25f, 17.91f, 7.56f, 17.91f)
                lineTo(15.51f, 17.93f)
                curveTo(18.68f, 17.93f, 21.26f, 15.34f, 21.26f, 12.16f)
                curveTo(21.26f, 10.63f, 20.66f, 9.18f, 19.57f, 8.09f)
                curveTo(19.28f, 7.8f, 19.28f, 7.32f, 19.57f, 7.03f)
                curveTo(19.86f, 6.74f, 20.34f, 6.74f, 20.63f, 7.03f)
                curveTo(22f, 8.41f, 22.76f, 10.23f, 22.76f, 12.16f)
                curveTo(22.76f, 16.17f, 19.51f, 19.43f, 15.51f, 19.43f)
                lineTo(9.44f, 19.41f)
                lineTo(10.53f, 20.45f)
                curveTo(10.83f, 20.74f, 10.84f, 21.21f, 10.55f, 21.51f)
                curveTo(10.39f, 21.67f, 10.2f, 21.75f, 10f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 12.75f)
                horizontalLineTo(9f)
                curveTo(8.59f, 12.75f, 8.25f, 12.41f, 8.25f, 12f)
                curveTo(8.25f, 11.59f, 8.59f, 11.25f, 9f, 11.25f)
                horizontalLineTo(15f)
                curveTo(15.41f, 11.25f, 15.75f, 11.59f, 15.75f, 12f)
                curveTo(15.75f, 12.41f, 15.41f, 12.75f, 15f, 12.75f)
                close()
            }
        }.build()

        return _RepeateMusic!!
    }

@Suppress("ObjectPropertyName")
private var _RepeateMusic: ImageVector? = null
