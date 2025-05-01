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

val Iconsax.Outline.SafeHome: ImageVector
    get() {
        if (_SafeHome != null) {
            return _SafeHome!!
        }
        _SafeHome = ImageVector.Builder(
            name = "Outline.SafeHome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.53f, 23.75f)
                curveTo(18.38f, 23.75f, 18.24f, 23.73f, 18.11f, 23.7f)
                curveTo(16.79f, 23.34f, 15.6f, 22.55f, 14.75f, 21.47f)
                curveTo(13.84f, 20.34f, 13.34f, 18.96f, 13.34f, 17.57f)
                verticalLineTo(15.38f)
                curveTo(13.34f, 14.66f, 13.82f, 13.93f, 14.49f, 13.65f)
                lineTo(17.28f, 12.51f)
                curveTo(18.1f, 12.19f, 18.99f, 12.19f, 19.8f, 12.51f)
                lineTo(22.6f, 13.65f)
                curveTo(23.27f, 13.93f, 23.76f, 14.66f, 23.76f, 15.38f)
                verticalLineTo(17.57f)
                curveTo(23.76f, 20.36f, 21.76f, 22.94f, 19.01f, 23.7f)
                curveTo(18.84f, 23.73f, 18.68f, 23.75f, 18.53f, 23.75f)
                close()
                moveTo(18.54f, 13.75f)
                curveTo(18.3f, 13.75f, 18.06f, 13.79f, 17.83f, 13.89f)
                lineTo(15.06f, 15.03f)
                curveTo(14.96f, 15.07f, 14.84f, 15.26f, 14.84f, 15.38f)
                verticalLineTo(17.57f)
                curveTo(14.84f, 18.62f, 15.22f, 19.67f, 15.92f, 20.54f)
                curveTo(16.58f, 21.38f, 17.49f, 21.99f, 18.48f, 22.26f)
                curveTo(18.51f, 22.27f, 18.57f, 22.27f, 18.62f, 22.25f)
                curveTo(20.67f, 21.68f, 22.24f, 19.67f, 22.24f, 17.57f)
                verticalLineTo(15.38f)
                curveTo(22.24f, 15.26f, 22.12f, 15.08f, 22.01f, 15.03f)
                lineTo(19.23f, 13.89f)
                curveTo(19.01f, 13.8f, 18.78f, 13.75f, 18.54f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.34f, 21.75f)
                horizontalLineTo(6.18f)
                curveTo(4.44f, 21.75f, 2.84f, 20.4f, 2.55f, 18.69f)
                lineTo(1.29f, 11.14f)
                curveTo(1.08f, 9.95f, 1.67f, 8.42f, 2.61f, 7.66f)
                lineTo(9.19f, 2.4f)
                curveTo(10.481f, 1.36f, 12.5f, 1.37f, 13.79f, 2.41f)
                lineTo(20.371f, 7.66f)
                curveTo(21.32f, 8.42f, 21.9f, 9.95f, 21.691f, 11.14f)
                lineTo(21.26f, 13.73f)
                curveTo(21.221f, 13.95f, 21.08f, 14.15f, 20.881f, 14.26f)
                curveTo(20.681f, 14.37f, 20.441f, 14.39f, 20.23f, 14.3f)
                lineTo(19.23f, 13.89f)
                curveTo(18.791f, 13.71f, 18.29f, 13.71f, 17.83f, 13.89f)
                lineTo(15.061f, 15.03f)
                curveTo(14.96f, 15.07f, 14.84f, 15.26f, 14.84f, 15.38f)
                verticalLineTo(17.57f)
                curveTo(14.84f, 18.62f, 15.22f, 19.67f, 15.92f, 20.54f)
                curveTo(16.101f, 20.76f, 16.14f, 21.07f, 16.01f, 21.33f)
                curveTo(15.891f, 21.58f, 15.63f, 21.75f, 15.34f, 21.75f)
                close()
                moveTo(11.481f, 3.12f)
                curveTo(10.991f, 3.12f, 10.491f, 3.27f, 10.13f, 3.56f)
                lineTo(3.55f, 8.82f)
                curveTo(3.03f, 9.24f, 2.66f, 10.22f, 2.77f, 10.88f)
                lineTo(4.03f, 18.43f)
                curveTo(4.2f, 19.41f, 5.18f, 20.24f, 6.18f, 20.24f)
                horizontalLineTo(13.981f)
                curveTo(13.561f, 19.39f, 13.34f, 18.47f, 13.34f, 17.55f)
                verticalLineTo(15.36f)
                curveTo(13.34f, 14.64f, 13.821f, 13.91f, 14.491f, 13.63f)
                lineTo(17.281f, 12.49f)
                curveTo(18.101f, 12.17f, 18.99f, 12.17f, 19.8f, 12.49f)
                lineTo(19.941f, 12.55f)
                lineTo(20.221f, 10.89f)
                curveTo(20.33f, 10.23f, 19.961f, 9.25f, 19.441f, 8.83f)
                lineTo(12.86f, 3.58f)
                curveTo(12.48f, 3.27f, 11.981f, 3.12f, 11.481f, 3.12f)
                close()
            }
        }.build()

        return _SafeHome!!
    }

@Suppress("ObjectPropertyName")
private var _SafeHome: ImageVector? = null
