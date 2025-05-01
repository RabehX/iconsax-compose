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

val Iconsax.Outline.Airplane: ImageVector
    get() {
        if (_Airplane != null) {
            return _Airplane!!
        }
        _Airplane = ImageVector.Builder(
            name = "Outline.Airplane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.58f, 22.55f)
                curveTo(8.36f, 22.55f, 8.13f, 22.51f, 7.92f, 22.42f)
                curveTo(7.45f, 22.22f, 7.09f, 21.83f, 6.93f, 21.34f)
                lineTo(6.49f, 20.02f)
                curveTo(6.29f, 19.42f, 6.47f, 18.67f, 6.91f, 18.22f)
                lineTo(9.18f, 15.94f)
                curveTo(9.21f, 15.91f, 9.25f, 15.8f, 9.25f, 15.75f)
                verticalLineTo(13.28f)
                lineTo(4.69f, 15.25f)
                curveTo(4.08f, 15.51f, 3.46f, 15.48f, 2.99f, 15.17f)
                curveTo(2.52f, 14.86f, 2.24f, 14.3f, 2.24f, 13.65f)
                verticalLineTo(12.36f)
                curveTo(2.24f, 11.38f, 2.94f, 10.33f, 3.83f, 9.98f)
                lineTo(9.24f, 7.64f)
                verticalLineTo(4.8f)
                curveTo(9.24f, 3.59f, 10.09f, 2.2f, 11.17f, 1.64f)
                curveTo(11.69f, 1.38f, 12.29f, 1.38f, 12.8f, 1.64f)
                curveTo(13.89f, 2.2f, 14.74f, 3.58f, 14.74f, 4.79f)
                verticalLineTo(7.63f)
                lineTo(20.18f, 9.97f)
                curveTo(21.07f, 10.35f, 21.75f, 11.37f, 21.75f, 12.36f)
                verticalLineTo(13.65f)
                curveTo(21.75f, 14.31f, 21.48f, 14.86f, 21f, 15.17f)
                curveTo(20.52f, 15.48f, 19.91f, 15.51f, 19.3f, 15.26f)
                lineTo(14.74f, 13.29f)
                verticalLineTo(15.76f)
                curveTo(14.74f, 15.8f, 14.78f, 15.9f, 14.81f, 15.93f)
                lineTo(17.09f, 18.22f)
                curveTo(17.53f, 18.66f, 17.71f, 19.43f, 17.51f, 20.02f)
                lineTo(17.07f, 21.34f)
                curveTo(16.9f, 21.83f, 16.54f, 22.22f, 16.06f, 22.41f)
                curveTo(15.59f, 22.6f, 15.07f, 22.58f, 14.62f, 22.36f)
                curveTo(14.57f, 22.33f, 14.52f, 22.3f, 14.47f, 22.26f)
                lineTo(12.14f, 20.3f)
                curveTo(12.06f, 20.23f, 11.9f, 20.24f, 11.83f, 20.3f)
                lineTo(9.5f, 22.26f)
                curveTo(9.46f, 22.3f, 9.41f, 22.33f, 9.36f, 22.35f)
                curveTo(9.12f, 22.49f, 8.85f, 22.55f, 8.58f, 22.55f)
                close()
                moveTo(9.56f, 11.64f)
                curveTo(9.79f, 11.64f, 10.01f, 11.7f, 10.2f, 11.83f)
                curveTo(10.55f, 12.06f, 10.75f, 12.45f, 10.75f, 12.91f)
                verticalLineTo(15.76f)
                curveTo(10.75f, 16.19f, 10.54f, 16.7f, 10.24f, 17f)
                lineTo(7.97f, 19.28f)
                curveTo(7.93f, 19.33f, 7.89f, 19.48f, 7.91f, 19.54f)
                lineTo(8.35f, 20.87f)
                curveTo(8.38f, 20.97f, 8.45f, 21.01f, 8.49f, 21.03f)
                curveTo(8.52f, 21.04f, 8.57f, 21.06f, 8.63f, 21.04f)
                lineTo(10.87f, 19.15f)
                curveTo(11.5f, 18.61f, 12.49f, 18.61f, 13.12f, 19.15f)
                lineTo(15.35f, 21.03f)
                curveTo(15.42f, 21.04f, 15.47f, 21.03f, 15.5f, 21.02f)
                curveTo(15.54f, 21f, 15.62f, 20.96f, 15.65f, 20.86f)
                lineTo(16.09f, 19.54f)
                curveTo(16.11f, 19.47f, 16.07f, 19.32f, 16.03f, 19.28f)
                lineTo(13.76f, 17f)
                curveTo(13.46f, 16.72f, 13.24f, 16.2f, 13.24f, 15.76f)
                verticalLineTo(12.91f)
                curveTo(13.24f, 12.46f, 13.43f, 12.07f, 13.77f, 11.84f)
                curveTo(14.11f, 11.61f, 14.55f, 11.58f, 14.97f, 11.76f)
                lineTo(19.89f, 13.88f)
                curveTo(20.04f, 13.94f, 20.14f, 13.94f, 20.17f, 13.92f)
                curveTo(20.2f, 13.9f, 20.24f, 13.81f, 20.24f, 13.65f)
                verticalLineTo(12.36f)
                curveTo(20.24f, 11.98f, 19.92f, 11.49f, 19.58f, 11.35f)
                lineTo(14f, 8.94f)
                curveTo(13.56f, 8.75f, 13.25f, 8.27f, 13.25f, 7.79f)
                verticalLineTo(4.79f)
                curveTo(13.25f, 4.13f, 12.73f, 3.28f, 12.13f, 2.98f)
                curveTo(12.05f, 2.94f, 11.95f, 2.94f, 11.86f, 2.98f)
                curveTo(11.28f, 3.28f, 10.75f, 4.15f, 10.75f, 4.8f)
                verticalLineTo(7.8f)
                curveTo(10.75f, 8.27f, 10.44f, 8.76f, 10f, 8.95f)
                lineTo(4.42f, 11.36f)
                curveTo(4.07f, 11.5f, 3.75f, 11.99f, 3.75f, 12.36f)
                verticalLineTo(13.65f)
                curveTo(3.75f, 13.81f, 3.79f, 13.9f, 3.82f, 13.92f)
                curveTo(3.85f, 13.94f, 3.95f, 13.94f, 4.1f, 13.88f)
                lineTo(9.01f, 11.76f)
                curveTo(9.19f, 11.68f, 9.38f, 11.64f, 9.56f, 11.64f)
                close()
            }
        }.build()

        return _Airplane!!
    }

@Suppress("ObjectPropertyName")
private var _Airplane: ImageVector? = null
